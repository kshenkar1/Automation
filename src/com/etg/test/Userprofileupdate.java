package com.etg.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Userprofileupdate {

	public static void main(String[] args) throws Exception {
		
		executeUserprofileupdate(Util.getChromeDriver());
		
		
	}	
		
	
	public static void executeUserprofileupdate(WebDriver driver) throws Exception {
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

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("rakesh");

		driver.findElement(
				By.xpath("//button[@class='lg-button login_submit']")).click();

		driver.findElement(By.xpath("//i[@class='sprite-icon icon-user']"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("ul/li[1]/a/i")).click();

		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Rakesh reddy Bomidika");

		driver.findElement(By.id("phone")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("9948418762");

		// Select dropdown = new
		// Select(driver.findElement(By.xpath("//div[4]/div/input")));
		// dropdown.selectByIndex(1);
		// dropdown.selectByVisibleText("India");
		// Thread.sleep(2000);

		// Select dropdown1 = new Select(
		// driver.findElement(By.xpath("//div[5]/div/input")));
		// dropdown1.selectByIndex(3);
		// dropdown1.selectByVisibleText("Andhra Pradesh");
		// Thread.sleep(2000);

		// Select dropdown2 = new Select (
		// driver.findElement(By.xpath("//div[6]/div/input")));
		// dropdown2.selectByIndex(2);

		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys("500081");

		driver.findElement(By.xpath("//textarea")).clear();
		driver.findElement(By.xpath("//textarea")).sendKeys("Hyderabad");

		driver.findElement(
				By.xpath("//button[@class='waves-effect waves-light btn blue accent-2' ]"))
				.click();
		
		//driver.findElement(By.xpath("//a[@class='lg-button']")).click();
		Thread.sleep(2000);

		/*driver.findElement(By.xpath("html/body/header/div/div[2]/ul/li[2]/a/i"))
				.click();
		

		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();*/
		
		driver.findElement(By.xpath("html/body/header/div/div[2]/ul/li[2]/a/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/header/div/div[2]/ul/li[2]/ul/li[2]/a/span")).click();
		
		
		
		

	}

}
