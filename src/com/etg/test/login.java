package com.etg.test;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shankar.challa\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\shankar.challa\\Desktop\\EventsNowlogincredentials.csv")));
		
		String str = "";
		reader.readLine();	
		while ((str = reader.readLine()) != null) {
						
		String[] strArray = str.split(",");
								
			if(strArray != null && strArray.length == 2){
					String Username = strArray[0];
					String Password = strArray[1];		
		driver.get("http://www.enwstg.com/users/login");
		driver.findElement(By.id("exampleInputAmount")).clear();
	    driver.findElement(By.id("exampleInputAmount")).sendKeys(Username);
	    driver.findElement(By.id("password1")).clear();
	    driver.findElement(By.id("password1")).sendKeys(Password);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    driver.findElement(By.id("dropdownMenu1")).click();
	    driver.findElement(By.linkText("Logout")).click();

	}

}
		}
	}

