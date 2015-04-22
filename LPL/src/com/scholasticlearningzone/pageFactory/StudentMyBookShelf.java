package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class StudentMyBookShelf {

	WebDriver driver;
	
	//#1
	public void myProfile()
	   { 
			driver.findElement(By.xpath("//span[text()='My Bookshelf']")).click();
			//My Book Shelf
		}
	
	//#2
	public void booksAssignedBy()
	   {
		List<WebElement> c = driver.findElements(By.xpath("//div[@id='custom_style']/select"));
		Select select=new Select((WebElement) c);
		for(int i=0;i<=2;i++)
		{
		select.selectByIndex(i);
		}
		//books assigned by filter drop down
		//need to change code
		}
	
	//#3
	public void moreInFoSearchlink()
	{
		driver.findElement(By.xpath("//span[text()='More book info >']")).click();
		   //more info book link
	}
	
	//#4
	public void ReadBookButton()
	   { 
		driver.findElement(By.xpath("//div/button/span[text()='Read Book ']")).click();
		//read book button on page
	   }
	
	//#5
	public void RemoveButton()
	   { 
		driver.findElement(By.xpath("//div/button/span[text()='Remove']")).click();
		//remove button on page
	   }

	//#6
	public void preNavigatorArrow()
	{
		driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[1]")).click();
		 //left navigator arrow
		//  //div[@id='libraryBooks']/div/div/div[3]/span[1]
		//left navigator arrow
	}
	
	//#7
	public void postNavigatorArrow()
	{
		driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[2]")).click();
		 //Right navigator arrow
	}
	
	//#8
	public void clickOnBook(String title)
	{
		driver.findElement(By.xpath("//div/div[@title='"+title+"']/a/img")).click();
		//click on a book image
	}
	
	//#9
	public void clickOnInfoPopIcon(String title)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[@class='bookinfo']/a/img")).click();
		//click on more info pop-up icon on the book
	   }
	
	//#10
	public void clickOnReaderIcon(String title)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[@class='bookopen']/a/img")).click();
		//click on read book icon on the book
	   }
	
	//#11
	public void popUpReadBookButton()
	{
		driver.findElement(By.xpath("//div[@class='page-content-library-popup']/div/div[2]/div/button/span[text()='Read Book ']")).click();
		   //read button in the book info pop-up
	}
	
	//#12
	public void popUpRemoveButton()
	{
		driver.findElement(By.xpath("//div[@class='page-content-library-popup']/div/div[2]/div/button/span[text()='Remove']")).click();
		   //remove button in the book info pop-up
	}
	
	//#13
	public void popUpCrossButton(String title)
	{
		driver.findElement(By.xpath("//div[//span[text()='"+title+"']]/a/span[@class='ui-icon ui-icon-closethick']")).click();
		   //more info pop-up cross(close) button
	}
	
	//#14
	public void countTeacherAssignBooks()
	   { 
			
		}
	
	//#15
	public void countStudentSelfAssignBooks()
	   { 
			
		}
	
}
