package com.Drivers;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetTest {
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.licindia.in");	
	}
	
	@Test
	public void testcase(){
		driver.findElement(By.className("icon-facebook")).click();
		
		 Set<String> windowids=driver.getWindowHandles();	
		 Iterator<String> windowid= windowids.iterator();
		 
		 String mwid=windowid.next();
		 String fwid=windowid.next();
		 
		 driver.switchTo().window(fwid);
		 driver.findElement(By.id("email")).sendKeys("Shristi");
		 
		 driver.switchTo().window(mwid);
		 driver.quit();
	}
}
