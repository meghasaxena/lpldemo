package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Teacher {

WebDriver driver;

	//#1
	public void message()
	   { 
		driver.findElement(By.xpath("//form/li[@id='studentNoNotifications']")).click();
		//message icon on teacher sign-in
		}
	
	//#2
	public void information()
	   { 
		driver.findElement(By.xpath("//form/li[@id='studentInfo']")).click();
		// information icon on teacher sign-in
		}
	
	//#3
	public void logout()
	   { 
		driver.findElement(By.xpath("//span/a[text()='Logout']")).click();
		//logout icon on teacher sign-in
		}
	
	//#4
	public void setting()
	   { 
		driver.findElement(By.xpath("//form/li[@id='studentSettings']")).click();
		//setting icon on page for student on teacher sign-in
		}
	
	//#5
	public void jumpOnReader()
	   { 
			// switch on reader window
		}
}
