package com.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	 public static WebDriver getdriver(String browsertest) {
		 
		 
		 if(browsertest.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				return new ChromeDriver();
		 }
		 
		 else if (browsertest.equalsIgnoreCase("mozilla")) {
			 System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
				return new FirefoxDriver();
		 }
		 
		 else if (browsertest.equalsIgnoreCase("IE")) {
			 System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
				return new InternetExplorerDriver();
		 }
		 
		 else
			 System.out.println("Invalid Browser");
		     return null;
		 
	 }
	 

}
