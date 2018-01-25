package com.etg.test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.etg.test.Util;

public class Bannerevent {

	public static void main(String[] args) throws Exception {
		executeBannerEvent(Util.getChromeDriver());
		
	}
	

	public static void executeBannerEvent(WebDriver driver) throws Exception {
	
		driver.get("http://172.16.1.28");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// driver.findElement(By.linkText("/hyderabad-event/kashmiri-food-festival-at-siesta-hitech/5476"));
		driver.findElement(By.linkText("VIBRATIONS 2K17@ Katriya Hotel"))
				.click();

		Thread.sleep(2000);

		// selecting the ticket

		Select dropdown = new Select(driver.findElement(By.id("ticket-10026")));
		dropdown.selectByIndex(1);
		Thread.sleep(2000);

		// Selecting book now

		// driver.findElement(By.id("booknow")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Book Now']")).click();

		// Login

		driver.findElement(By.id("user-email")).clear();
		driver.findElement(By.id("user-email"))
				.sendKeys("raksdude23@gmail.com");
		Thread.sleep(2000);

		// driver.findElement(By.id("user-password")).clear();
		driver.findElement(By.id("user-password")).sendKeys("rakesh");
		Thread.sleep(2000);

		driver.findElement(By.id("list-btn-1")).click();

		Thread.sleep(3000);

		// driver.findElement(By.id("checkbox_0")).click();

		driver.findElement(By.id("attendee_name_0_0")).sendKeys("Rakesh Reddy");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_email_0_0")).sendKeys(
				"raksdude23@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_phone_0_0")).sendKeys("9948418762");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id='data-6982-attendee-10026-0-gender-male']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_weekEndsOnly_0_0")).sendKeys(
				"2017-04-15");

		/*
		 * JavascriptExecutor Js = (JavascriptExecutor)driver; Js.executeScript(
		 * "document.getElementById('attendee_weekdaysOnly_0_0').value='2017-05-15'"
		 * );
		 */

		System.out.println("ssssssssf");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_contactPhoneNumber_0_0")).sendKeys(
				"9632587415");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_contactEmail_0_0")).sendKeys(
				"abcd@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_pincode_0_0")).sendKeys("500510");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_contactName_0_0"))
				.sendKeys("Rakesh");
		Thread.sleep(500);

		// driver.findElement(By.linkText("Proceed to payment")).click();

		// driver.findElement(By.xpath("//*[@id='list-btn-2']")).click();

		driver.findElement(
				By.xpath("//button[@class='lg-button accor-btn attendee_form_submit']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id='list-btn-3 payment_gateway_submit']"))
				.click();

		driver.findElement(By.xpath("//input[@name='card_number_all']"))
				.sendKeys("4111111111111111");

		driver.findElement(By.id("mm1")).clear();
		driver.findElement(By.id("mm1")).sendKeys("07");

		driver.findElement(By.id("yy1")).clear();
		driver.findElement(By.id("yy1")).sendKeys("18");

		driver.findElement(By.xpath("//input[@name='card_cvv']")).clear();
		driver.findElement(By.xpath("//input[@name='card_cvv']")).sendKeys(
				"123");

		driver.findElement(By.xpath("//input[@name='name_on_card']")).clear();
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys(
				"EBS");

		driver.findElement(
				By.xpath("//button[@class='btn btn-primary submitbtnv4 card-continue']"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@class='lg-button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("html/body/header/div/div[2]/ul/li[2]/a/i"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();

	}

}
