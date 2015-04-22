package com.scholasticlearningzone.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeacherHome {
	WebDriver driver;
	
	public TeacherHome(WebDriver driver){
		this.driver=driver;
	}
	
	//#1
	public void goToHomePage()
	{
		driver.findElement(By.xpath("//div/span[text()='Home']")).click();
		//click on the home tab
	}
	
	//#2
	public void clickOnClassDropDown(String clasName)
	{
		driver.findElement(By.xpath("//div/h3/a[text()='"+clasName+"']")).click();
		//click on the class drop down
	}
	
	//#3
	public void goToStudentPage(String stdName)
	{
		driver.findElement(By.xpath("//td[@role='gridcell']/a/span[text()='"+stdName+"']")).click();
		//click on the student under class under home
	}
	
	//#4
	public void goToCompletedBookTab()
	{
		driver.findElement(By.xpath("//ul[@role='tablist']/li[2]")).click();
		//click on the completed book tab under home
	}
	
	//#5
	public void goToReadingBookTab()
	{
		driver.findElement(By.xpath("//a[text()='Books in Progress']")).click();
		//click on the reading book tab under home
	}
	
	//#6
	public void postNavigatArrowUnderReadingBookHome()
	{
		driver.findElement(By.xpath("//div/div[@id='viewdetailsform:tabView:studentBookSelf_paginator_top']/span[5]")).click();
		//click on navigator arrow in the reading book tab under home page
	}
	
	//#7
	public void preNavigatArrowUnderReadingBookHome()
	{
		driver.findElement(By.xpath("//div/div[@id='viewdetailsform:tabView:studentBookSelf_paginator_top']/span[3]")).click();
		//click on navigator arrow in the reading book tab under home page
	}
	
	//#8
	public void postNavigatArrowUnderCompletedBookHome()
	{
		driver.findElement(By.xpath("//div[@id='viewdetailsform:tabView:studentBookSelf1_paginator_top']/span[5]")).click();
		//click on navigator arrow in the Completed book tab under home page
	}
	
	//#9
	public void preNavigatArrowUnderCompletedBookHome()
	{
		driver.findElement(By.xpath("//div[@id='viewdetailsform:tabView:studentBookSelf1_paginator_top']/span[3]")).click();
		//click on navigator arrow in the Completed book tab under home page
	}
	
	//#10
	public void clickOnBook(String title)
	{
		driver.findElement(By.xpath("//div/div[@title='"+title+"']/img")).click();
		//click on a book image under reading book tab
	}
	
	//#11
	public void clickOnInfoPopIconOnReadingBook(String title)
	   { 
		driver.findElement(By.xpath(" //div[//div[@title='"+title+"']]/div[2]/div[@class='bookinfo']/a/img")).click();
		//click on more info pop-up icon on the book under reading book tab
	   }
	
	//#12
	public void clickOnReaderIconOnReadingBook(String title)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[2]/div[@class='bookopen']/a/img")).click();
		//click on read book icon on the book under reading book tab
	   }
	
	public void clickOnBookOnCompletedBookTab()
	   { 
		
		//click on read book icon on the book under completed book tab
		}
	
	//#13
	public void clickOnInfoPopIconOnCompletedBook()
	   {

		//click on more info pop-up icon on the book under completed book tab
		}
	
	//#14
	public void clickOnReaderOnCompletedBook()
	   { 
		
		//click on read book icon on the book under completed book tab
		}
	
	//#15
	public void teacherAssignedBook(String title)
	{
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[2]/div[@class='bookassigned']/img"));
		//shows Teacher assigned book
	}
	
	//#16
	public void removeButtonOnTeacherAssginedBook()
	   {
		driver.findElement(By.xpath("//div[@class='button-readbook-teacher']/button/span[text()='Remove Book']")).click();
		//click on remove button on the teacher assigned book pop-up
		//div[div[//span[text()='germs']]]/div[2]/div/div/div/div/div[2]/div[7]/div[2]/button/span[text()='Remove Book']
		//need to correct
	   }
	
	//#17
	public void popUpCrossButton(String title)
	{
		driver.findElement(By.xpath("//div[//span[text()='"+title+"']]/a/span")).click();
		   //more info pop-up cross(close) button
	}
	
	//#18
	public void getStudentNote()
	   { 
		
		//click on read book icon on the book under completed book tab
		}
	
	//#19
	public void getStudentRecording()
	   { 
		
		//click on read book icon on the book under completed book tab
		}
	
	    //#20
		public void countTeacherAssignBooks()
		   { 
				
			}
		
		//#21
		public void countStudentSelfAssignBooks()
		   { 
				
			}
		
		public void classDetail()
		{
			try{
				List<WebElement> a= driver.findElements(By.tagName("span"));
				 int b= a.size();
				 System.out.println(b);
			
				for(int i=0;i<=b;i++)
				{
					 Thread.sleep(1000);
				String c = a.get(i).getText();
				 Thread.sleep(1000);
				System.out.println(c);
				}
				}
				catch(Exception e)
				{
					System.out.println("no issues");
				}
			
		}
		
		public void stdDetail()
		{
			try{
				List<WebElement> aa= driver.findElements(By.xpath("//div[@class='homestu-details']/div/span[1]"));
				int bb= aa.size();
				 System.out.println(bb);
			
				for(int i=0;i<=bb;i++)
				{
					 Thread.sleep(1000);
				String c = aa.get(i).getText();
				 Thread.sleep(1000);
				System.out.println(c);
				}
				}
				catch(Exception e)
				{
					System.out.println("no issues");
				}
		}
		
		public void notesOnPopUp()
		{
			try{
				List<WebElement> aa= driver.findElements(By.xpath("//div[@class='book-notes']/div[2]"));
				int bb= aa.size();
				 System.out.println(bb);
			
				for(int i=0;i<=bb;i++)
				{
					 Thread.sleep(1000);
				String c = aa.get(i).getText();
				 Thread.sleep(1000);
				System.out.println(c);
				}
				}
				catch(Exception e)
				{
					System.out.println("no issues");
				}
		}
		
}
