package LPL.Teacher;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.scholasticlearningzone.common.action.LPLSuper;

//import com.scholasticlearningzone.pageFactory.TeacherLibrary;

public class Home_CheckCompletedBooksTab extends LPLSuper {
	@Test
	public void f() throws InterruptedException {

		driver.findElement(By.xpath("//div[@id='mybookshelf']/span")).click();
		// click on the search and assign
		// Boolean b=
		// driver.findElement(By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[2]")).isEnabled();
		int co = 0;
		Thread.sleep(2000);
		Boolean b = true;
		while (b) {

			co = co + driver.findElements(By.xpath("//div/a/img")).size();

			b = driver
					.findElement(
							By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[2]"))
					.isEnabled();
			if(b.equals(true)){
			driver.findElement(
					By.xpath("//div[@id='libraryBooks']/div/div/div[1]/span[2]"))
					.click();}
			Thread.sleep(2000);
			

		}
		/*
		 * Thread.sleep(5000); TeacherLibrary.libraryTab(); Thread.sleep(5000);
		 * System.out.println("hello"); int c=TeacherLibrary.count();
		 * System.out.println(c);
		 */
	}
}
