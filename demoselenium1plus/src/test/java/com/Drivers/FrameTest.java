package com.Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {
	
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com");	
	}
	
	@Test
	public void testcase(){
		driver.findElement(By.id("get_sign_in")).click();
		WebElement frameid=driver.findElement(By.id("authiframe"));
		driver.switchTo().frame(frameid);
		
		driver.findElement(By.id("authMobile")).sendKeys("9579269280");
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#authOverlay > div > a")).click();
		driver.findElement(By.linkText("Cars")).click();
	}
	
	/*@AfterMethod
	public void closebrowser(){
		driver.close();
		System.out.println("browser has been closed");}*/

}
