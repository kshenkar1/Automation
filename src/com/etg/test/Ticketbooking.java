package com.etg.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Ticketbooking {

	public static void main(String[] args) {
		executeTicketBooking(Util.getChromeDriver());
	}

	public static void executeTicketBooking(WebDriver driver) {

		System.out.println("In Ticket Booking Execution : " + Util.getCurrentDateTime());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.enwstg.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a > span")).click();
		
		driver.findElement(By.id("exampleInputAmount")).clear();
	    driver.findElement(By.id("exampleInputAmount")).sendKeys("kshenkar@gmail.com");
	    driver.findElement(By.id("password1")).clear();
	    driver.findElement(By.id("password1")).sendKeys("charan13");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.cssSelector("img[title=\"melody Kings\"]")).click();
		
		
		 driver.findElement(By.id("ticket-7892")).click();
	    new Select(driver.findElement(By.id("ticket-7892"))).selectByVisibleText("1");
		    driver.findElement(By.cssSelector("option[name=\"7892-1-2000\"]")).click();
		    driver.findElement(By.id("eventtc")).click();
		    driver.findElement(By.id("booknow")).click();
		
		    driver.findElement(By.id("UserZip")).clear();
		    driver.findElement(By.id("UserZip")).sendKeys("500038");
		    driver.findElement(By.id("myticketd_7892")).click();
		    driver.findElement(By.id("ggender_0_7892Male")).click();
		    driver.findElement(By.id("gdob_0_7892")).click();
		    JavascriptExecutor Js = (JavascriptExecutor)driver;
		    Js.executeScript("document.getElementById('gdob_0_7892').value='22/09/1978'");
		    
		  //  driver.findElement(By.xpath("//div[@id='sizzle-1483618098838']/ul/li/div/div/table/tbody/tr[2]/td[5]")).click();
		    new Select(driver.findElement(By.id("gqualification__0_7892"))).selectByVisibleText("Post Graduate");
		    driver.findElement(By.xpath("//input[@value='Next']")).click();
		    driver.findElement(By.id("submit")).click();
		    driver.navigate().to("http://www.enwstg.com/");
		    driver.findElement(By.id("dropdownMenu1")).click();
		    driver.findElement(By.linkText("Logout")).click(); 

		    System.out.println("Exit Ticket Booking Execution");
	}
}
