package com.etg.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SearchEvents {

	//To run this method as a stand alone program or testcase
	public static void main(String[] args) {
		executeSearchEvents(Util.getChromeDriver());
	}

	//To execute this testcase as a multiple testcases execution
	public static void executeSearchEvents(WebDriver driver) {
		
		System.out.println("In Search Events Execution");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.enwstg.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a > span")).click();
		
		driver.findElement(By.id("exampleInputAmount")).clear();
	    driver.findElement(By.id("exampleInputAmount")).sendKeys("kshenkar@gmail.com");
	    driver.findElement(By.id("password1")).clear();
	    driver.findElement(By.id("password1")).sendKeys("charan13");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.id("autocomplete")).clear();
	    driver.findElement(By.id("autocomplete")).sendKeys("Kashmiri Food Festival at Siesta Hitech");
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    new Select(driver.findElement(By.id("ticket-7046"))).selectByVisibleText("1");
	    driver.findElement(By.id("booknow")).click();
	    driver.findElement(By.id("UserZip")).clear();
	    driver.findElement(By.id("UserZip")).sendKeys("500038");
	    driver.findElement(By.id("myticketd_7046")).click();
	    driver.findElement(By.xpath("//input[@value='Next']")).click();
	    driver.findElement(By.id("submit")).click();
	    driver.navigate().to("http://www.enwstg.com/");
	    driver.findElement(By.id("dropdownMenu1")).click();
	    driver.findElement(By.linkText("Logout")).click();

	    System.out.println("Exit Search Events Execution");
	}
}
