package com.etg.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) throws Exception {
		
		executeForgotPassword(Util.getChromeDriver());
	}
		
	
	public static void executeForgotPassword(WebDriver driver) throws Exception {
		// Launch of browser
	/*	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shankar.challa\\Desktop\\rakeshscripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("http://172.16.1.28");
		driver.manage().window().maximize();
		// Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);

		// Click on login link
		driver.findElement(By.linkText("Sign In")).click();
		// /Thread.sleep(2000);

		driver.findElement(By.linkText("Forgot Password?")).click();
		// Thread.sleep(2000);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("raksdude23@gmail.com");

		// Submit button

		driver.findElement(By.xpath("//button[@class='lg-button']")).click();
		// Thread.sleep(5000);

	}

}
