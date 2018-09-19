package com.Drivers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Selectddn {
	
	WebDriver driver;
	String browsertest="chrome";
	
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");	
	}
	
	@Test
	public void testcase(){
		System.out.println("browser has been launched");
		WebElement DDL=driver.findElement(By.name("country"));
		Select SDDL=new Select(DDL);
		
		List<WebElement> options= SDDL.getOptions();
		int sol=options.size();
		
		System.out.println("Size of dropdown list is" +sol);
		for(WebElement el:options)
		{
			System.out.println(el.getText());
		}

}}
