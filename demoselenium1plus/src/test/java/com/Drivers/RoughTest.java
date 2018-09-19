package com.Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RoughTest {
	WebDriver driver;
	String browsertest="chrome";
	
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");	
	}
	
	@Test
	public void testcase(){
		System.out.println("browser has been launched");
	}
	
	@AfterMethod
	public void closebrowser(){
		driver.close();
		System.out.println("browser has been closed");
	}

}
