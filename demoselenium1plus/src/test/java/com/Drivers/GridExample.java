package com.Drivers;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridExample {
	
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser() throws MalformedURLException{
		
		String nodeURL="http://10.20.88.130:5588/wd/hub"; // Node IP Address
		
		DesiredCapabilities caps=DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);
		
		driver=new RemoteWebDriver(new URL(nodeURL), caps);
		
		
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
	
	@Test
	public void testcase(){
		driver.get("http://www.flipkart.com");
		System.out.println(driver.getTitle());

}
}
