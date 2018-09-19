package com.Drivers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Links {
	
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
	public void testcase(){
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		System.out.println("Popup closed");
		System.out.println("browser has been launched");
		List<WebElement> Links=driver.findElements(By.tagName("a"));	
		int numoflink=Links.size();
		
		System.out.println("Size of dropdown list is = " +numoflink);
		int i=1;
		for(WebElement el:Links)
		{
			
			if(!el.getText().equals("")){
			System.out.println("Link number "+i+ " is " +el.getText());
			i++;}
		}
	}
	
	@AfterMethod
	public void closebrowser(){
		driver.close();
		System.out.println("browser has been closed");

}
}
