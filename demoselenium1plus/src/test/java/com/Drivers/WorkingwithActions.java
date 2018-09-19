package com.Drivers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingwithActions {
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.drikpanchang.com");	
	}
	
	@Test
	public void testcase(){
		WebElement panchang=driver.findElement(By.linkText("Panchang"));
		
		Actions mouse= new Actions(driver);
		
		mouse.moveToElement(panchang).build().perform();;
		
		driver.findElement(By.cssSelector("#dpMenuId > li:nth-child(3) > div.dpSubMenuList.dpLeft > div:nth-child(2) > a:nth-child(4)")).click();
			 
	}


}
