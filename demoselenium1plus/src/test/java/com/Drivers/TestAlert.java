package com.Drivers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAlert {
	
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
	}
	
	@Test
	public void testcase(){
		driver.findElement(By.name("proceed")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
	}
	
	/*@AfterMethod
	public void closebrowser(){
		driver.close();
		System.out.println("browser has been closed");}*/



}
