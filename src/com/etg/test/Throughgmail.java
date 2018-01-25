package com.etg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Throughgmail {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shankar.challa\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		 driver.get("https://www.eventsnow.com/");
		 driver.manage().window().maximize();		
		 driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		 driver.findElement(By.linkText("Sign in with Google")).click();
		 
		 
		 for(String winHandle : driver.getWindowHandles()){
	          driver.switchTo().window(winHandle);
	        }
	       System.out.println("Title of the page after - switchingTo: " + driver.getTitle());
	       Thread.sleep(3000);
		 
		 
		 //driver.findElement(By.id("Email")).clear();
		 driver.findElement(By.id("Email")).sendKeys("kailashchalla");Thread.sleep(3000);
		 driver.findElement(By.id("next")).click();Thread.sleep(3000);
		 //driver.findElement(By.id("Passwd")).clear();
		 driver.findElement(By.id("Passwd")).sendKeys("charan13");
		 driver.findElement(By.id("signIn")).click();Thread.sleep(3000);		 
		// driver.switchTo().activeElement();
		// driver.switchTo().defaultContent();
		 driver.findElement(By.id("dropdownMenu1")).click();
		 
		 driver.findElement(By.linkText("Logout")).click();
		 
		 driver.manage().deleteAllCookies();
		 
		

	}

}
