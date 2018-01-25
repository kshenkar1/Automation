package com.etg.test;

import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService.Builder;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;



public class Sportsevent {

	public static void main(String[] args) throws InterruptedException {
		executeSportsevent(Util.getChromeDriver());
	}
	
	public static void executeSportsevent(WebDriver driver) throws InterruptedException{
		
		 driver.get("http://www.enwstg.com/");
		 driver.manage().window().maximize();		 
		 
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//*[@id='fixedNav']/div/div/div[1]/div/h6"));
		 action.moveToElement(we).build().perform();
		 
		 Thread.sleep(2000);
		WebElement we1 = driver.findElement(By.xpath("//*[@id='fixedNav']/div/div/div[1]/div/div/div/ul/li[2]/a"));
		action.moveToElement(we).moveToElement(we1).click().build().perform();
		// action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id='fixedNav']/div/div/div[1]/div/div/div/ul/li[5]/a"))).click().build().perform();
		 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("h4[title=\"INDIA Vs NEW ZEALAND 5th ODI 2017\"]")).click();Thread.sleep(20000);
		driver.findElement(By.linkText("1")).click();Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='owl-stage-outer']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='prize-info']")).click();Thread.sleep(2000);
		System.out.println("kailasssssssssss");

		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		 WebElement web2 = driver.findElement(By.id("draggable"));
		 WebElement web3 = driver.findElement(By.tagName("g"));
		 List<WebElement> web4 = driver.findElements(By.tagName("polygon"));
		 System.out.println(web4.get(0));
		
		 action1.moveToElement(web2).moveToElement(web3).moveToElement(web4.get(0)).click().build().perform();
		 
		 Thread.sleep(2000);
		 
		 
		 List<WebElement> list1 =   driver.findElements(By.className("seat-block"));
			List<WebElement> list2 =  driver.findElements(By.className("selected-seat"));
			
			
			
			Iterator<WebElement> it1 =list1.iterator();
			while(it1.hasNext()) {
				WebElement el = it1.next();
				if(!list2.contains(el)) {
					el.click();
						}
			}

		 
		 
		 
		// driver.findElement(By.id("H-272")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.linkText("Proceed to Checkout")).click();Thread.sleep(2000);
		
		 	driver.findElement(By.id("UserEmail")).clear();
		    driver.findElement(By.id("UserEmail")).sendKeys("kshenkar@gmail.com");Thread.sleep(2000);
		    driver.findElement(By.id("UserPassword")).clear();
		    driver.findElement(By.id("UserPassword")).sendKeys("charan13");Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='Submit']")).click();Thread.sleep(2000);
		
			driver.findElement(By.id("UserZip")).clear();
			driver.findElement(By.id("UserZip")).sendKeys("500038");
			
			 new Select(driver.findElement(By.id("UserIdenityType"))).selectByVisibleText("Pan Card");
			    driver.findElement(By.id("UserIdCardNumber")).clear();
			    driver.findElement(By.id("UserIdCardNumber")).sendKeys("AQYPK1931E");
			    driver.findElement(By.xpath("//input[@value='Next']")).click();
			    driver.findElement(By.id("submit")).click();
		
			    driver.navigate().to("http://www.enwstg.com/"); 
				driver.findElement(By.id("dropdownMenu1")).click();
			    driver.findElement(By.linkText("Logout")).click();
	
	}

}
