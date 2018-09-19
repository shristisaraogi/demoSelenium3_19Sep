package com.Day1.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BasicAnnotations {
	
	@Test
	public void testcase() throws InterruptedException {
		
		//Step 1: Set the system property
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		//Step2: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Setp3: Launch URL
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		
		driver.close();	

	}

}
