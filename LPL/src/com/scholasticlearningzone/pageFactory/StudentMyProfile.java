package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.scholasticlearningzone.common.action.LPLSuper;

public class StudentMyProfile extends LPLSuper{

	WebDriver driver;
	
	//#1
	public void goToMyProfilePage()
   { 
		driver.findElement(By.xpath("//span[text()='My Profile']")).click();
		//my profile
	}
	
	//#2
	public void goToReadingBook()
	{
		driver.findElement(By.xpath("//ul[@role='tablist']/li[1]")).click();
		//click on the reading book tab under home
	}
	
	//#3
	public void goToCompletedBookTab()
	{
		driver.findElement(By.xpath("//ul[@role='tablist']/li[2]")).click();
		//click on the completed book tab under home
	}
	
	//#4
	public void prevNavigatorOnReadingBookTab()
	   { 
			driver.findElement(By.xpath("//div/div[ul[li[a]]]/div/div[1]/div/div/div[1]/span[1]")).click();
		//   //div[@id='stuProfileTabWrapper']/div[ul[li[a[contains(text(),'m Reading')]]]]/div/div[1]/div/div/div[1]/span[1]
	   //on reading book tab left navigator arrow
	   }
	
	//#5
	public void postNavigatorOnReadingBookTab()
	   { 
			driver.findElement(By.xpath("//div/div[ul[li[a]]]/div/div[1]/div/div/div[1]/span[2]")).click();
			 //on reading book tab right navigator arrow
	   }
	
	//#6
	public void prevNavigatorOnCompletedBookTab()
	   { 
			driver.findElement(By.xpath("//div/div[ul[li[a]]]/div/div[2]/div/div/div[1]/span[1]")).click();
			 //on completed book tab left navigator arrow
	   }
	
	//#7
	public void postNavigatorOnCompletedBookTab()
	   { 
			driver.findElement(By.xpath("//div/div[ul[li[a]]]/div/div[2]/div/div/div[1]/span[2]")).click();
			//on completed book tab right navigator arrow
	   }
	
	//#8
	public void clickOnBook(String bn)
	   { 
			driver.findElement(By.xpath("//div/div[@title='"+bn+"']")).click();
			//click on book
	   }
	
	//#9
	public void clickOnInfoPopIcon(String bn)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+bn+"']]/div[@class='bookinfo']/a/img")).click();
		//click on info pop-up icon on book
		}
	
	//#10
	public void clickOnReaderIcon(String bn)
	   { 
		driver.findElement(By.xpath("//div[//div[@title='"+bn+"']]/div[@class='bookopen']/a/img")).click();
		//click on reader icon on book
	   }
	
	//#11
	public void removeButtonOnPopUp()
	   { 
		driver.findElement(By.xpath("//div/div[3]/button/span[text()='Remove']")).click();
		//remove button on info pop-up
	   }
	
	//#12
	public void stratOverButtonOnPopUp()
	   { 
		driver.findElement(By.xpath("//button/span[text()='Start Over']")).click();
		// start over button on info pop-up
	   }
	
	//#13
	public void ContinueReadingButtonOnPopUp()
	   { 
		driver.findElement(By.xpath("//button/span[text()='Continue Reading >']")).click();
		// Continue reading button on info pop-up
	   }
	
	//#14
	public void popUpCrossButton(String title)
	{
		driver.findElement(By.xpath("//div[//span[text()='"+title+"']]/a/span")).click();
		   //more info pop-up cross(close) button
	}
	//this method same as teacher home
	
	//#15
	public void teacherAssignedBook(String title)
	{
		driver.findElement(By.xpath("//div[//div[@title='"+title+"']]/div[2]/div[@class='bookassigned']/img"));
		//shows Teacher assigned book
	}
	//this method same as teacher home
	
	//#16
	public void getStudentNotes()
	   { 
		
		}
	
	//#17
	public void getStudentRecorder()
	   { 
			
		}
	
	//#18
	public void countTeacherAssignBooks()
	   { 
			
		}
	
	//#19
	public void countStudentSelfAssignBooks()
	   { 
			
		}
	
}
