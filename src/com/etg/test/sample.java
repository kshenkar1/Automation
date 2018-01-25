package com.etg.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {
	public static final String DELIMETER = " ," ;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalitcharan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("E:\\EventsNow.csv")));
		String str = "";
		reader.readLine();	
		BufferedWriter output = null;
		FileWriter file = new FileWriter(new File("E:\\EventsNow.txt"), true);
		output = new BufferedWriter(file);
		try {
			while ((str = reader.readLine()) != null) {

				output.write("date" + DELIMETER + "username" + DELIMETER + "password" + DELIMETER + "result");
				output.newLine();

				String[] strArray = str.split(",");
				output.write("========================================================"+"\r\n");
				output.write(" "+Util.getCurrentDateTime()+DELIMETER);

				if(strArray != null){

					String password1 = null;
					String username1 = strArray[0];

					if (strArray.length == 2)
					{
						password1 = strArray[1];
					}				

					output.write(" "+username1+DELIMETER);
					output.write(" "+password1+DELIMETER);

					if (username1.length() == 0)
					{
						output.write("Username is empty" + DELIMETER);
						output.write("logged in fail "+DELIMETER);
					}
					else if (password1 == null || password1.length() == 0)
					{
						output.write(" Password is empty "+ DELIMETER);
						output.write("logged in fail "+DELIMETER);
					}

					driver.get("http://www.enwstg.com/users/login");
					driver.manage().window().maximize();
					driver.findElement(By.id("exampleInputAmount")).clear();
					driver.findElement(By.id("exampleInputAmount")).sendKeys(username1);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//	Thread.sleep(100);
					driver.findElement(By.id("password1")).clear();
					driver.findElement(By.id("password1")).sendKeys(password1);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//	Thread.sleep(500);
					driver.findElement(By.xpath("//input[@value='Login']")).click();

					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

					String pageSource = driver.getPageSource();

					if(pageSource != null && pageSource.contains("Your login attempt was not successful, try again.")) {
						output.write(" "+username1+" Your login attempt was not successful, try again. Caused : Bad credentials "+DELIMETER);
						output.write(" "+username1+" unable to login "+DELIMETER);
					} else {
						//driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/ul/li[4]/a")).click();
						
						//driver.findElement(By.id("dropdownMenu1")).click();
					 //   driver.findElement(By.linkText("Logout")).click();
						output.write(" "+username1+" logged in successfully with login credentials "+DELIMETER);
						output.write(" "+username1+" logged out successfully"+DELIMETER);
					}
				}
				output.newLine();
			}
		} finally {
			output.write("\r\n");			
			//driver.close();
			output.close();
		}

	}
}

	