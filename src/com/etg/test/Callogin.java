package com.etg.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Callogin {

	public static void main(String[] args) throws Exception {
		searchCallLogin(Util.getChromeDriver());
	}

	public static void searchCallLogin(WebDriver driver) throws Exception {

		System.out.println("In Call Login Execution");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.enwstg.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[3]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='calendar']/div[2]/div/div/div")).click();
		//driver.findElement(By.xpath("//div[@id='cal-day-tick']/i")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Relive the Magic of Movida")).click();
		new Select(driver.findElement(By.id("ticket-7921"))).selectByVisibleText("1");
		driver.findElement(By.id("booknow")).click();
		
		driver.findElement(By.id("UserEmail")).clear();
	    driver.findElement(By.id("UserEmail")).sendKeys("kshenkar@gmail.com");
	    driver.findElement(By.id("UserPassword")).clear();
	    driver.findElement(By.id("UserPassword")).sendKeys("charan13");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();		
		
		driver.findElement(By.cssSelector("input.btn.btn-danger")).click();
		driver.findElement(By.id("UserZip")).clear();
		driver.findElement(By.id("UserZip")).sendKeys("500038");
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		driver.findElement(By.id("submit")).click();
		driver.navigate().to("http://www.enwstg.com/");
		driver.findElement(By.id("dropdownMenu1")).click();
	    driver.findElement(By.linkText("Logout")).click();

	    System.out.println("Exit Call Login Execution");
	}
}
