package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Student {
	WebDriver driver;
	
	//#1
	public void message()
	   { 
		driver.findElement(By.xpath("//span/li[@id='studentNoNotifications']")).click();
		//message icon on student sign-in
	   }
	
	//#2
	public void information()
	   { 
		driver.findElement(By.xpath("//form/li[@id='studentInfo']")).click();
		//information icon on student sign-in
	   }
	
	//#3
	public void logout()
	   { 
		driver.findElement(By.xpath("//span/a[text()='Logout']")).click();
		//logout icon on student sign-in
	   }
	
	//#4
	public void jumpOnReader()
	   { 
			
		}
	
	
}
