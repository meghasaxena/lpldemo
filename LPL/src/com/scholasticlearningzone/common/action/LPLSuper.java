package com.scholasticlearningzone.common.action;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.scholasticlearningzone.common.utils.XlsHelper;

public class LPLSuper {
	public WebDriver driver=null;
	String path="./config/EnvConfig.xls";
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  //login to application
	 // Reporter.log("hi",true);
	  //System.out.println("Hello-Hi");
	// System.out.println("Hello");
	//String un="Teacher1";
	//String id="Welcome1";
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//Thread.sleep(3000);
	
	  driver = new FirefoxDriver();
	String url=XlsHelper.getStringCellVal(XlsHelper.getRow(XlsHelper.getSheet(path, "input"), 0), 1); 
	String un=XlsHelper.getStringCellVal(XlsHelper.getRow(XlsHelper.getSheet(path, "input"), 1), 1);
	String pwd=XlsHelper.getStringCellVal(XlsHelper.getRow(XlsHelper.getSheet(path, "input"), 2), 1);
	//wb.getSheet("sheet").getRow(0).getCell(0).getStringCellValue();
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='product-access']/div/ul/li/a/img")).click();
	//Launch LPL
    
	Set <String> set1=driver.getWindowHandles();
	Iterator <String> win1=set1.iterator();
	String parent=win1.next();
	String child=win1.next();
	driver.switchTo().window(child);
	
	Thread.sleep(8000);
	System.out.println(driver.getTitle());
	//switch the control to child window
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
	  
	  //close the browsers
	  
  }
  
}
