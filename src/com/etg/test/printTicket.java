package com.etg.test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTicket {

	public static void main(String[] args) throws Exception {
		// Launch of browser		
		executeprintTicket(Util.getChromeDriver());
	}
		public static void executeprintTicket(WebDriver driver) throws Exception {
		
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shankar.challa\\Desktop\\rakeshscripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("http://172.16.1.28");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//footer/div[1]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("booking-id")).clear();
		driver.findElement(By.id("booking-id")).sendKeys("207110");

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("raksdude23@gmail.com");

		driver.findElement(
				By.xpath("//button[@class='print_ticket_submit lg-button']"))
				.click();
		Thread.sleep(2000);

		//driver.findElement(By.partialLinkText("View Ticket")).click();
		driver.findElement(By.xpath("//tr/td[4]/a[1]")).click();
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
	    Thread.sleep(2000);
		
	    driver.close();
		
		
	}

}

