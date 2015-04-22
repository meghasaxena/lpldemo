package com.scholasticlearningzone.common.utils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;
import com.scholasticlearningzone.common.action.LPLSuper;

public class common extends LPLSuper{

	static WebDriver driver;
	 public void maxWindow()
		{
			driver.manage().window().maximize();
		}
		
	 public void switchWindow()
	  {
		  Set <String> set1=driver.getWindowHandles();
			Iterator <String> win1=set1.iterator();
			String parent=win1.next();
			String child=win1.next();
			driver.switchTo().window(child);
	  }
	 
	 public void externalWait(int sec) throws InterruptedException
	 {
		 Thread.sleep(1000 * sec);
	 }
	  
	 public void explicitWait()
	 {
		 //WebDriverWait wait=WebDriverWait(Until.expectedCondition...);
	 }
	 
	 
	 public void implicitWait(long t)
	 {
		 driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	 }
	 
	 public void jumpToReader()
		{
			
		}
	//#
		public static int count()
		{
			int count=driver.findElements(By.xpath("//div/a/img")).size();
			// for get number of books
			return(count);
		}
		
		//#
		public void verifyTitle(String eTitle)
		{
			//Genric.explicitWait(3);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle,eTitle);
			System.out.println(aTitle);
			//verify title
		}
		
		/*//#
		public void verifyMessage(String eTitle)
		{
			//Genric.explicitWait(3);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle,eTitle);
			System.out.println(aTitle);
			//verify message
		}*/
	 
}
