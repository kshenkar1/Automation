package com.etg.test;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {

	public static WebDriver getChromeDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shankar.challa\\Desktop\\rakeshscripts\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		return driver;
	}
	
	public static String getCurrentDateTime() {

		java.util.Date todaysDate = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE dd-MMM-yyyy HH:mm:ss");
		String formattedDate = formatter.format(todaysDate);

		return formattedDate;
	}
}
