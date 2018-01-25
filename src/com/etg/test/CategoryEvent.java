package com.etg.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CategoryEvent {

	public static void main(String[] args) throws Exception {
		executeCategoryEvent(Util.getChromeDriver());
	}
	
	public static void executeCategoryEvent(WebDriver driver) throws Exception {
	
		// Launch of browser
	//	System.setProperty("webdriver.chrome.driver", 	"C:\\Users\\shankar.challa\\Desktop\\rakeshscripts\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		driver.get("http://172.16.1.28");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// driver.findElement(By.xpath("//a[contains(text(),'New Year Events')]")).click();
		driver.findElement(By.linkText("New Year Events")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("PIRATES NITE 2017 @Aditya Park"))
				.click();

		// selecting the ticket

		Select dropdown = new Select(driver.findElement(By.id("ticket-10141")));
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

		/*
		 * JavascriptExecutor Js = (JavascriptExecutor); Js.executeScript(
		 * "document.getElementById('attendee_weekdaysOnly_0_0').value='2017-04-11'"
		 * );
		 */

		driver.findElement(By.id("attendee_weekdaysOnly_0_0")).sendKeys(
				"2017-04-11");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_firstName_0_0")).sendKeys(
				"Rakesh Reddy");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_email_0_0")).sendKeys(
				"raksdude23@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_phone_0_0")).sendKeys("9948418762");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_contactName_0_0"))
				.sendKeys("rakesh");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_contactEmail_0_0")).sendKeys(
				"raksdude23@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("attendee_contactPhoneNumber_0_0")).sendKeys(
				"9948418762");
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//button[@class='lg-button accor-btn attendee_form_submit']"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//button[@class='lg-button accor-btn  payment_gateway_submit']")).click();
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
