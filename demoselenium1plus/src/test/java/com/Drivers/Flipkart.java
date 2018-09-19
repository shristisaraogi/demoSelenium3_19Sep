package com.Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	String browsertest="chrome";
	
	
	@BeforeMethod
	public void openbrowser(){
		
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");	
	}
	
	@Test
	public void testcase() throws InterruptedException{
		
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	System.out.println("Popup closed");
	WebElement searchbox = driver.findElement(By.name("q"));
	WebElement searchbutton= driver.findElement(By.className("vh79eN"));
	
	searchbox.sendKeys("Shoes");
	Thread.sleep(2000);
	searchbutton.click();
	Thread.sleep(2000);
	driver.navigate().back();
	searchbox.clear();
	
	searchbox.sendKeys("Watches");
	Thread.sleep(2000);
	searchbutton.click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	searchbox.clear();
	
	}
	
	
}
