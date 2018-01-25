package com.etg.test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.etg.test.Util;

public class MyTickets {

	public static void main(String[] args) throws Exception {
		
		
		executeMyTickets(Util.getChromeDriver());
	}
		
	public static void executeMyTickets(WebDriver driver) throws Exception {
		
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shankar.challa\\Desktop\\rakeshscripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("http://172.16.1.28/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Sign In")).click();

		// Login
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("raksdude23@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("rakesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='lg-button login_submit']")).click();
		

		driver.findElement(By.xpath("//i[@class='sprite-icon icon-user']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[1]/td[7]/a")).click();
		Thread.sleep(2000);
		
		Set <String> handles =driver.getWindowHandles();
	    Iterator<String> it = handles.iterator();

	    String parent = it.next();
	    String child = it.next();

	    driver.switchTo().window(child);

	    //perform actions on child window
	    //perform actions on child window

	    driver.close(); // only for child wondow


	    driver.switchTo().window(parent);
	    
	   /* driver.findElement(By.xpath("//a[@class='lg-button']")).click();
		Thread.sleep(2000);*/

		driver.findElement(By.xpath("html/body/header/div/div[2]/ul/li[2]/a/i"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
	    

	}

}
