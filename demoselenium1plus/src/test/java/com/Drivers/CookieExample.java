package com.Drivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class CookieExample {
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");	
	}
	
	@Test
	public void testcase()
	{
		driver.manage().deleteAllCookies();
		Cookie cookies=new Cookie("username","FP");
		driver.manage().addCookie(cookies);
		
		Set<Cookie> acookie=driver.manage().getCookies();
		
		for (Cookie c:acookie)
		{
			System.out.println("Cookies name is"+c.getName()+ "Cookies Domain is"+c.getDomain()+"cookies exp date is" + c.getExpiry());
		}	
	}
}
