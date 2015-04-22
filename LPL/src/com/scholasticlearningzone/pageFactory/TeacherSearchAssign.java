package com.scholasticlearningzone.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherSearchAssign {

	WebDriver driver;
	
	//#
	public void searchAssign()
	{
		driver.findElement(By.xpath("//div[@id='mybookshelf']/span")).click();
		// click on the search and assign
	}
	
	//#
	public void fictioncheckbox()
	{
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[2]")).click();
		// click on fiction Check box under search and assign
	}
	
	//#
	public void readingLevelFilter()
	{
		driver.findElement(By.xpath("//div/div/h3[2]/span[@class='ui-icon ui-icon-triangle-1-e']")).click();
		//expand reading level 
		driver.findElement(By.id("form:filterAccordion:lexileRangeFrom")).sendKeys("br");//from value
		driver.findElement(By.id("form:filterAccordion:lexileRangeTo")).sendKeys("br");//To value
		driver.findElement(By.id("form:filterAccordion:goId")).click();//Go button
	}
	
	//#
	public void interestCategoryFilter()
	{
		driver.findElement(By.xpath("//div/div/h3[3]/span[@class='ui-icon ui-icon-triangle-1-e']")).click();
		//interest category expand
	}
	
	//#
	public void biographyUnderInterstCat()
	{
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default filledBoxbiographies']")).click();
				//select biography
	}
	
	//#
	public void hiLoUnderInterstCat()
	{
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default filledBoxon']")).click();
				//click on Hi-Lo CB
	}
	
	//#
	public void clickBookUnderSearchAssign()
	{
		driver.findElement(By.id("form:studentBookSelf:5:j_idt241")).click();
		//click on book
	}
	
	//#
	public void step2Button()
	{
		driver.findElement(By.id("form:ajax25")).click();
		//click on step2 button
	}
	
	//#
	public void assignBook()
	{
		driver.findElement(By.id("form:studentBookSelf:5:j_idt241")).click();
		//click on book
		driver.findElement(By.id("form:ajax25")).click();
		//click on step2 button
		driver.findElement(By.xpath("//table[@id='step2HeaderTable']/tbody/tr/td/div/div[2]")).click();
		//click on all check box
		driver.findElement(By.id("form:ajax32")).click();
		//click on assign
	}
	
	//#
	public void step1Button()
	{
		driver.findElement(By.xpath("//div[@class='search-for']/div/div/button")).click();
		  //click on step1
	}
	
	//#
	public void nextButton()
	{
		driver.findElement(By.xpath("//div[@class='search-next']/button[@role='button']")).click();
		   //next button
	}
	
	//#
	public void schoolSubjectFilter()
	{
		driver.findElement(By.xpath("//a[text()='School Subject']")).click();
	    //school subject under search
	}
	
	//#
	public void InterestCategoryFilter()
	{
		driver.findElement(By.xpath("//a[text()='Interest Category']")).click();
	    //Interest Category under search
	}
	
	//#
	public void ReadingSkillFilter()
	{
		driver.findElement(By.xpath("//a[text()='Reading Skill']")).click();
	    //Reading Skill under search
	}
	
	//#
	public void FormatFilter()
	{
		driver.findElement(By.xpath("//a[text()='Format']")).click();
	    //Format under search
	}
	
	//#
	public void AudioReadAloudFilter()
	{
		driver.findElement(By.xpath("//td[text()='Audio Read Aloud']")).click();
	    //Audio Read Aloud under search
	}
	
	//#
	public void hiLoFilter()
	{
		driver.findElement(By.xpath("//td[text()='Hi-Lo']")).click();
	    //Hi-Lo under search
	}
	
	
}
