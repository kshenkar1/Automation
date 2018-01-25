package com.etg.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventsnowRegistrationpage {
	
	

	public static void main(String[] args) throws Exception {
		
		executeEventsnowRegistrationpage(Util.getChromeDriver());	
	}
	
	
	public static void executeEventsnowRegistrationpage(WebDriver driver) throws Exception {
	
	
		// Launch of browser
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\shankar.challa\\Desktop\\rakeshscripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("http://172.16.1.28");
		driver.manage().window().maximize();
		// Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		// Click on login link
		driver.findElement(By.linkText("Sign In")).click();
		// Thread.sleep(2000);

		// click on sign up link
		driver.findElement(By.linkText("Signup")).click();

		// User name
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("shankar");

		// Choose email
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kshenkar@gmail.com");

		// creating password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("charan@13");

		// confirm password
		driver.findElement(By.id("confirm-password")).clear();
		driver.findElement(By.id("confirm-password")).sendKeys("charan@13");

		// Phone number

		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("9948418675");

		// Submit button

		driver.findElement(
				By.xpath("//button[@class='lg-button signup_submit']")).click();
		// Thread.sleep(5000);

	}

}
