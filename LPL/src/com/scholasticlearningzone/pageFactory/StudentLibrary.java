package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class StudentLibrary {

	WebDriver driver;
	
	//#1
	public void Library()
	   { 
			driver.findElement(By.xpath("//span[text()='Library']")).click();
			// Library
		}
	
	//#2
	public void search(String bn)
	{
		driver.findElement(By.xpath("//div[@class='search']/div/div/input")).sendKeys(bn);
		driver.findElement(By.xpath("//div[@class='search']/div/div/input")).sendKeys(Keys.RETURN);
		 // search text box under library
		
		//driver.findElement(By.xpath("//div[@class='search']/div/div/a")).click();
		   //click on search icon
	}
	//same as teacher
	
	//#3
	public void moreInFoSearchlink()
	{
		driver.findElement(By.xpath("//span[text()='More book info >']")).click();
		   //more info book link
	}
	
	//#4
	public void addToMyBookShelfButton()
	   { 
		driver.findElement(By.xpath("//div/button/span[text()='Add to My Bookshelf']")).click();
		// "Add To My Book Shelf" button on page
	   }
	
	//#5
	public void clickOnInfoPopIcon(String title)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[@class='bookinfo']/a/img")).click();
		//click on more info pop-up icon on the book
	   }
		//driver.findElement(By.xpath("//div[@class='bookactions clear-fix ']/div/a/img']")).click();
		
	//#6
	public void preNavigatorArrow()
	{
		driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[1]")).click();
		 //left navigator arrow
		//  //div[@id='libraryBooks']/div/div/div[3]/span[1]	
	}
	
	//#7
	public void postNavigatorArrow()
	{
		driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[2]")).click();
		 //Right navigator arrow
	}
	//both pre and post same as teacher
	
	//#8
	public void clickOnBook(String title)
	{
		driver.findElement(By.xpath("//div/div[@title='"+title+"']/a/img")).click();
		//click on a book image
	}
	
	//#9
	public void popUpAddToMyBookShelfButton()
	{
		driver.findElement(By.xpath("//div[@class='page-content-library-popup']/div/div[2]/button")).click();
		   //add to my book shelf button in the book info pop-up
	}
	
	//#10
	public void popUpCrossButton(String title)
	{
		driver.findElement(By.xpath("//div[//span[text()='"+title+"']]/a/span[@class='ui-icon ui-icon-closethick']")).click();
		   //more info pop-up cross(close) button
	}
}
