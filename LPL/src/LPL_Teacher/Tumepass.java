package LPL_Teacher;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.concurrent.TimeUnit;

public class Tumepass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://qa-slz01.scholasticlearningzone.com/auth/intl/Login/CAN9WC5");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Teacher1");
		driver.findElement(By.id("password")).sendKeys("Welcome1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		//driver.findElement(By.id("logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='product-access']/div/ul/li/a/img")).click();
		//Launch LPL
		
		Set <String> set1=driver.getWindowHandles();
		Iterator <String> win1=set1.iterator();
		String parent=win1.next();
		String child=win1.next();
		driver.switchTo().window(child);
		
	    Thread.sleep(3000);
	    
	    
		driver.findElement(By.xpath("//*[@id='myProfile']/span")).click();//click on the home tab
		Thread.sleep(3000);
		System.out.println("Hi");
		
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@role='gridcell']/a")).click();
		//click on the student under home
		Thread.sleep(3000);
		System.out.println("Hello");
		driver.findElement(By.xpath("//li[@class='ui-state-default ui-corner-top']/a")).click();
		Thread.sleep(3000);
		System.out.println("Hi");
		//click on the completed book tab under home
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Books in Progress']")).click();
		//click on the reading book tab under home
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/div[@id='viewdetailsform:tabView:studentBookSelf_paginator_top']/span[5]")).click();
		//click on navigator arrow in the reading book tab under home page
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='tile_header2']")).click();// click on the search and assign
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[2]")).click();// click on fiction Checkbox
		driver.findElement(By.xpath("//div/div/h3[2]/span[@class='ui-icon ui-icon-triangle-1-e']")).click();
		//expand reading level 
		driver.findElement(By.id("form:filterAccordion:lexileRangeFrom")).sendKeys("br");//from value
		driver.findElement(By.id("form:filterAccordion:lexileRangeTo")).sendKeys("br");//To value
		driver.findElement(By.id("form:filterAccordion:goId")).click();//Go button
		driver.findElement(By.xpath("//div/div/h3[3]/span[@class='ui-icon ui-icon-triangle-1-e']")).click();//interest category expand
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default filledBoxbiographies']")).click();
		//select biography
		//driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default filledBoxon']")).click();
		//click on Hi-Lo CB
		Thread.sleep(3000);
		driver.findElement(By.id("form:studentBookSelf:5:j_idt241")).click();
		//click on book
		Thread.sleep(3000);
		System.out.println("Hello");
		driver.findElement(By.id("form:ajax25")).click();
		//click on step2 button
		System.out.println("Hi");
		driver.findElement(By.xpath("//table[@id='step2HeaderTable']/tbody/tr/td/div/div[2]")).click();
		System.out.println("Hello");
		//click on all check box
		//driver.findElement(By.id("form:ajax32")).click();
		//click on assign
		System.out.println("Hi");
		/*
		 driver.findElement(By.xpath("//div[@class='search-for']/div/div/button")).click();
		  //click on step1
		 //different coding here, for both buttons step1 and step2 same xpath
		  
		   driver.findElement(By.xpath("//div[@class='search-next']/button[@role='button']")).click();
		   //next button
		    driver.findElement(By.xpath("//a[text()='School Subject']")).click();
		    //school subject under search
		     driver.findElement(By.xpath("//a[text()='Interest Category']")).click();
		    //school subject under search
		    driver.findElement(By.xpath("//a[text()='Reading Skill']")).click();
		    //Reading Skill under search
		     driver.findElement(By.xpath("//a[text()='Format']")).click();
		    //Format under search
		    driver.findElement(By.xpath("//td[text()='Audio Read Aloud']")).click();
		    //Audio Read Aloud under search
		    driver.findElement(By.xpath("//td[text()='Hi-Lo']")).click();
		    //Hi-Lo under search
		    
		 */

		
		driver.findElement(By.xpath("//div/div[3]/span[@class='tile_header3']")).click();
		
		//click on  library tab
		/*
		 driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div/span[1]")).click();
		 //left navigator arrow
		 driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div/span[2]")).click();
		 //Right navigator arrow
		  driver.findElement(By.id("form:search_textfield")).sendKeys("Cat");
		  // search text box under lib
		   driver.findElement(By.id("form:j_idt181")).click();
		   //click on search icon
		   driver.findElement(By.xpath("//span[text()='More book info >']")).click();
		   //more info book link
		   
		 */
		//----------------------------------
		WebElement read = driver.findElement(By.id("form:studentBookSelf:2:j_idt189"));
		// cursor on book reader optn
		Actions act = new Actions(driver);

		// To click on the element
		act.moveToElement(read).click().perform();
		
		//driver.findElement(By.id("form:studentBookSelf:2:j_idt193")).click();
		//click on the info pop-up icon
		// will have to handle pop-up here
		driver.findElement(By.id("form:studentBookSelf:2:j_idt196")).click();
		//click on the reader icon
		//driver.findElement(By.id("form:ajax5")).click();
		//click on the View full book button
		
		Thread.sleep(5000);
		set1=driver.getWindowHandles();
		win1=set1.iterator();
		String parent2=win1.next();
		String child2=win1.next();
		String child3=win1.next();
		driver.switchTo().window(child3);
		
		
		driver.findElement(By.xpath("//div[@id='page-right-button']/img")).click();
		//------------------------------------------------
		
		driver.findElement(By.id("settingsImg")).click();
		//click on setting
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='viewType']/div/div[2]/label")).click();
		//double page radio button
		driver.findElement(By.xpath("//div[@id='page-right-button']/img")).click();
		//right navigator
		driver.findElement(By.id("settingsImg")).click();
		driver.findElement(By.id("settingsImg")).click();
		//click on setting
		Thread.sleep(3000);
		driver.findElement(By.id("jumpToPage")).sendKeys("30");
		driver.findElement(By.id("jumpToPage")).sendKeys(Keys.RETURN);
		// page jump
		
		/*
		  
		  driver.findElement(By.id("//div[@id='page-left-button']/img")).click();
		 //right navigator arrow
		 
		driver.findElement(By.id("playbackRate")).click();
		//reset
		driver.findElement(By.xpath("//div[@id='playbackrateslider']/a")).click();
		//audio speed
		driver.findElement(By.id("readAloudElement")).click();
		//read aloud
		driver.findElement(By.id("changeVolumeIcon")).click();
		//volume
		driver.findElement(By.id("full-screen-btn")).click();
		//maximize (popup handling)
		*/
		
		
		
		
		driver.quit();
		//driver.close();
		
		
		

	}

}
