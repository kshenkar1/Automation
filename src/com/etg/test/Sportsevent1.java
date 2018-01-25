package com.etg.test;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class Sportsevent1 {

	public static int noOfSeats = 0;

	public static void main(String[] args) throws InterruptedException {
		/*		for(int i = 0; i <= 10; i++) {
			noOfSeats = i;
			executeSportsevent(Util.getChromeDriver());
		}
		 */	

		FileInputStream fs;
		try {
			fs = new FileInputStream("C:\\Users\\shankar.challa\\Downloads\\mydata\\Testdata1.xls");
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet s = wb.getSheet(0);

			String userName = null;
			String password = null;
			Random random = new Random();
			int min = 1;
			int max = 10;

			for ( int i=1; i < s.getRows(); i++)
			{
				noOfSeats = random.nextInt(max - min + 1) + min;
				userName = s.getCell(0, i).getContents();
				password = s.getCell(1, i).getContents();

				executeSportsevent(Util.getChromeDriver(), userName, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void executeSportsevent(WebDriver driver, String username, String password) throws InterruptedException{

		try {
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
			driver.findElement(By.linkText(String.valueOf(noOfSeats))).click();Thread.sleep(2000);

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

			Thread.sleep(3000);


			List<WebElement> allSeats =   driver.findElements(By.className("seat-block"));
			List<WebElement> filledSeats =  driver.findElements(By.className("selected-seat"));

			WebElement startSeat = null;
			int counter = 0;

			Iterator<WebElement> allSeatsIteration = allSeats.iterator();

			//Check are there any filled seats or not. If some seats are filled, then select empty seats
			if(filledSeats != null && !filledSeats.isEmpty()) {
				//Iterating through all seats
				while(allSeatsIteration.hasNext()) {
					//Get each seat
					WebElement seat = allSeatsIteration.next();
					//Check it is filled or not
					if(!filledSeats.contains(seat)) {
						//If not, mark this seat as select seat
						if(startSeat == null) {
							startSeat = seat;
						}
						//Increment the counter as it required to select the required no.of Seats
						++counter;
						//If counter matches to no.Of seats required, then select the marked seat and breaks the loop.
						if(counter == noOfSeats) {
							startSeat.click();
							break;
						}
					} else {
						//Means there is filled seat in between the required seats.
						//Making the counter as 0 to start newly.
						counter = 0;
						//Making startSeat as null to mark new seat.
						startSeat = null;
					}
				}
			} else {
				//If all seats are available, then select first seat itself
				allSeatsIteration.next().click();
			}

			// driver.findElement(By.id("H-272")).click();
			// Thread.sleep(2000);
			driver.findElement(By.linkText("Proceed to Checkout")).click();Thread.sleep(2000);

			driver.findElement(By.id("UserEmail")).clear();
			//driver.findElement(By.id("UserEmail")).sendKeys("kshenkar@gmail.com");
			driver.findElement(By.id("UserEmail")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.id("UserPassword")).clear();
			//driver.findElement(By.id("UserPassword")).sendKeys("charan13");
			driver.findElement(By.id("UserPassword")).sendKeys(password);
			Thread.sleep(2000);

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
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.close();
		}
	}
}