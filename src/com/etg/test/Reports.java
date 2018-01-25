package com.etg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reports {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch of browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shankar.challa\\Downloads\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://172.16.1.28");
			//	driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//Click on login link
				driver.findElement(By.linkText("Sign In")).click();
				Thread.sleep(2000);
									
				//enter user name
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("testeventsnow@gmail.com");
									
				// enter password
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys("testevents");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//form/ul/li[3]/label")).click();
				Thread.sleep(2000);
				
				// Click Login 
				driver.findElement(By.xpath("//button[@class='lg-button login_submit']")).click();
				Thread.sleep(5000);
				
				//Selecting admin page 
				
				driver.findElement(By.xpath("//li[2]/a/i")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//ul/li[3]/a/small")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//li[3]/ul/li[2]/a/span")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//ul/li[6]/a/i")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//ul/li[6]/ul/li[7]/a/span")).click();
				Thread.sleep(2000);
								
				driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/a")).click();
				Thread.sleep(2000);
				
				
				
				/*driver.findElement(By.xpath("//*[@id='is_active_chosen']/a/span")).click();
				driver.findElement(By.xpath("//*[@id='is_active_chosen']/div/div/input")).sendKeys("All");
				driver.findElement(By.xpath("//*[@id='is_active_chosen']/a/span")).click();
				*/
				driver.findElement(By.xpath("//*[@id='is_active_chosen']/a/span")).click();
				
				
				Actions action = new Actions(driver);
				WebElement we = driver.findElement(By.xpath(".//*[@id='is_active_chosen']/div/div/input"));
				action.moveToElement(we).build().perform();
				
				Thread.sleep(1000);
				
				Actions action1 = new Actions(driver);
				WebElement web2 = driver.findElement(By.xpath("//*[@id='is_active_chosen']/div/ul/li[2]"));
				action1.moveToElement(web2).click().build().perform();
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='is_active_chosen']/div/div/input")).sendKeys("All");
				
				// Actions action = new Actions(driver);
				 
			     //   action.moveToElement(element).build().perform();
			 
			    //    driver.findElement(By.id("")).click();
				
				
				
				
				
				
				
				driver.findElement(By.id(".//*[@id='is_active_chosen']/div/ul/li[2]")).click();
				//WebElement element = driver.findElement(By.id(".//*[@id='is_active_chosen']/div/ul")).click();
				//element.sendKeys(Keys.Tab);
				//element.sendKeys(Keys.ENTER);
				/*driver.findElement(By.xpath("//*[@id='is_active_chosen']/div/div/input")).sendKeys("All");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='is_active_chosen']/div/div/input")).submit();
				
				Select dropdown = new Select(driver.findElement(By.xpath("html/body/section/div/div[2]/div/div[3]/div[1]/form/div/div[2]/div[1]/div/div/div/div/ul/li[2]")));
				dropdown.selectByIndex(3);                                
				//dropdown.selectByValue("1");
				//dropdown.selectByVisibleText("All");
				
				driver.findElement(By.xpath(".//*[@id='is_active_chosen']/div/ul/li[3]")).click();
				driver.findElement(By.xpath("//*[@id='social_type_chosen']/a/span")).click();
				driver.findElement(By.xpath("//*[@id='social_type_chosen']/div/div/input")).sendKeys("All");
				driver.findElement(By.xpath("//*[@id='social_type_chosen']/a/span")).click();
				
				driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div[3]/div[1]/form/div/div[3]/div/div/a")).click();
				
				 
				driver.findElement(By.xpath("//*[@id='is_active_chosen']/a/span")).click();
				
				//Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='is_active_chosen']/a/span")));
				//dropdown.selectByIndex(1); 
				//dropdown.selectByValue("1");
				//dropdown.selectByVisibleText("All");
	
				Thread.sleep(200000);
				Thread.sleep(200000);
				Thread.sleep(200000);
				
				//driver.findElement(By.xpath("//ul/li[3]/a/small")).click();
				Thread.sleep(2000);
				
				
				//*[@id="is_active_chosen"]/div
				
				
			//	driver.findElement(By.xpath("//ul/li[3]/ul/li[4]/a/span")).click();
				Thread.sleep(2000);*/
		}
	}


