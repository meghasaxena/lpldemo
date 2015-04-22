package com.scholasticlearningzone.pageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TeacherLibrary {
	
	static WebDriver driver;
	
	//#1
	public static void libraryTab()
	{
		driver.findElement(By.xpath("//div/div[3]/span[text()='Library']")).click();
	    //click on  library tab
	}
	
	//#2
	public void preNavigatorArrow()
	{
		driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[1]")).click();
		 //left navigator arrow
		//  //div[@id='libraryBooks']/div/div/div[3]/span[1]	
	}
	
	//#3
	public void postNavigatorArrow()
	{
		driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[2]")).click();
		 //Right navigator arrow
	}
	
	//#4
	public void search(String bn)
	{
		driver.findElement(By.xpath("//div[@class='search']/div/div/input")).sendKeys(bn);
		driver.findElement(By.xpath("//div[@class='search']/div/div/input")).sendKeys(Keys.RETURN);
		 // search text box under library
		
		//driver.findElement(By.xpath("//div[@class='search']/div/div/a")).click();
		   //click on search icon
	}
	
	//#5
	public void moreInFoSearchlink()
	{
		driver.findElement(By.xpath("//span[text()='More book info >']")).click();
		   //more info book link
	}
	
	//#6
	public void clickOnBook(String title)
	{
		driver.findElement(By.xpath("//div/div[@title='"+title+"']/a/img")).click();
		//click on a book image
	}
	
	//#7
	public void clickOnInfoPopIcon(String title)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[@class='bookinfo']/a/img")).click();
		//click on more info pop-up icon on the book
	   }
	
	//#8
	public void clickOnReaderIcon(String title)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[@class='bookopen']/a/img")).click();
		//click on read book icon on the book
	   }
	
	//#9
	public void popUpReadButton()
	{
		driver.findElement(By.xpath("//div[@class='page-content-library-popup']/div/div[2]/button")).click();
		   //read button in the book info pop-up
	}
	
	//#10
	public void popUpCrossButton(String title)
	{
		driver.findElement(By.xpath("//div[//span[text()='"+title+"']]/a/span[@class='ui-icon ui-icon-closethick']")).click();
		   //more info pop-up cross(close) button
	}
	
	//#11
		public void viewFullBookButton()
		{
			driver.findElement(By.xpath("//div[@class='button-teacher-library']/button")).click();
			   //View Full Book Button on library page
		}
		
	
}
