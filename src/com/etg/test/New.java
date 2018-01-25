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

public class New {

	public static int noOfSeats = 0;
	public static void main(String[] args) throws InterruptedException {
		FileInputStream fs;
		try {
			fs = new FileInputStream("D:\\eclipse\\Supported_files\\excel\\Loginsheet.xls");
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet s = wb.getSheet(0);

			String username = null;
			String password = null;
			Random random = new Random();
			int min = 1;
			int max = 3;

			for ( int i=1; i < s.getRows(); i++)
			{
				noOfSeats = random.nextInt(max - min + 1) + min;
				username = s.getCell(0, i).getContents();
				password = s.getCell(1, i).getContents();
				executeSportsevent(Util.getChromeDriver(), username, password);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void executeSportsevent(WebDriver driver, String username, String password) throws InterruptedException{

		try {
			
			driver.get("http://172.16.1.28/events/7027-international-cricket-event-demo");//Open events now cricket event
			driver.manage().window().maximize();Thread.sleep(2000);//Maximize the window 
			
			driver.findElement(By.xpath("//*[@id='TicketDetailsForm']/section/aside/div[1]/h2")).click();Thread.sleep(2000);//Click on Ticket selection drop down menu
			driver.findElement(By.linkText(String.valueOf(noOfSeats))).click();Thread.sleep(2000);//Randomly select seats
			
			driver.findElement(By.xpath("//*[@id='TicketDetailsForm']/section/aside/div[2]/ul/li[1]/div/a")).click();Thread.sleep(2000);//Select 1000 tickets category
			
			Actions action1 = new Actions(driver);
			WebElement web2 = driver.findElement(By.id("g4"));
			WebElement web3 = driver.findElement(By.tagName("g"));
			List<WebElement> web4 = driver.findElements(By.tagName("path"));
			System.out.println(web4.get(0));
			action1.moveToElement(web2).moveToElement(web3).moveToElement(web4.get(0)).click().build().perform();
			Thread.sleep(2000);
			 
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

	 		Thread.sleep(2000);
			 
		    driver.findElement(By.linkText("Proceed to Checkout")).click();
			Thread.sleep(5000);
			 
			driver.findElement(By.id("user-email")).sendKeys(username);//Enter username
			driver.findElement(By.id("user-password")).sendKeys(password);//Enter Password
			driver.findElement(By.id("list-btn-1")).click();Thread.sleep(5000);// Click on Submit button
			
			driver.findElement(By.id("state_id")).click();
			Select select_state = new Select(driver.findElement(By.id("state_id")));
			select_state.selectByVisibleText("Andhra Pradesh");
			Thread.sleep(500);
			
			driver.findElement(By.id("city_id")).click();
			Select select_city = new Select(driver.findElement(By.id("city_id")));
			select_city.selectByVisibleText("Medak");
			Thread.sleep(500);
			
			driver.findElement(By.id("zip-code")).clear();//Clear the zip code
			driver.findElement(By.id("zip-code")).sendKeys("500081");//Enter Zip code
			driver.findElement(By.id("billing-address")).sendKeys("Sample address");//Enter Address
			 
			driver.findElement(By.xpath("//*[@id='list-2']/div/div")).click();Thread.sleep(2000); //click on Place an order button
			driver.findElement(By.xpath("//*[@id='list-btn-3']")).click();Thread.sleep(500); //click on Place an order button
			 
			//Enter Card Details
			driver.findElement(By.xpath("//*[@id='card_info']/tbody/tr[1]/td[3]/div/input")).sendKeys("EBS");
			driver.findElement(By.xpath("//*[@id='card_info']/tbody/tr[2]/td[3]/div/input[1]")).sendKeys("4111");
			driver.findElement(By.xpath("//*[@id='card_info']/tbody/tr[2]/td[3]/div/input[2]")).sendKeys("1111");
			driver.findElement(By.xpath("//*[@id='card_info']/tbody/tr[2]/td[3]/div/input[3]")).sendKeys("1111");
			driver.findElement(By.xpath("//*[@id='card_info']/tbody/tr[2]/td[3]/div/input[4]")).sendKeys("1111");

			//Enter Expiry Month			
			Select card_ex_month_dd = new Select(driver.findElement(By.xpath("//*[@id='card_expiry']/td[3]/div/select[1]")));
			card_ex_month_dd.selectByVisibleText("07 (Jul)");
			
			//Enter Expiry Year
			Select card_ex_year_dd = new Select(driver.findElement(By.xpath("//*[@id='card_expiry']/td[3]/div/select[2]")));
			card_ex_year_dd.selectByVisibleText("2018");
			
			driver.findElement(By.xpath("//*[@id='card_cvv']/td[3]/div[1]/input")).sendKeys("123");
			driver.findElement(By.xpath("//*[@id='submitbtn']")).click();
			Thread.sleep(9000);
			
			
			if(driver.getPageSource().contains("Congratulations"))
			{
				System.out.println("Transaction Succesfully completed for this " +username);
			}

			else
			{
			    System.out.println("Transaction not yet finished");
			}
			
			driver.get("http://172.16.1.28/users/logout");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.close();
		}
	}
}