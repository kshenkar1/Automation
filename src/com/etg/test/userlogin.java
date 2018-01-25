package com.etg.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class userlogin {
	

	public static void main(String[] args) throws BiffException, IOException   {		

				FileInputStream fs = new FileInputStream("C:\\Users\\shankar.challa\\Downloads\\mydata\\Testdata.xls");
				Workbook wb = Workbook.getWorkbook(fs);
				Sheet s = wb.getSheet(0);
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shankar.challa\\Downloads\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					
				 for ( int i=1; i<s.getRows(); i++)
				 {
						driver.get("http://www.enwstg.com/users/login");
					    driver.findElement(By.id("exampleInputAmount")).click();
						driver.findElement(By.id("exampleInputAmount")).sendKeys(s.getCell(0, i).getContents());
						driver.findElement(By.id("password1")).clear();
						driver.findElement(By.id("password1")).sendKeys(s.getCell(1, i).getContents());
						driver.findElement(By.xpath("//input[@value='Login']")).click();
						
						driver.findElement(By.id("dropdownMenu1")).click();
						
						driver.findElement(By.linkText("Logout")).click();
			
	}

}
}