package com.Drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");	
	}
	
	@Test
	public void testcase()
	{
		WebElement src=driver.findElement(By.cssSelector("#treebox1 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(5) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td.dhxTextCell.standartTreeRow > span"));
		WebElement tgt=driver.findElement(By.cssSelector("#treebox2 > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > table > tbody > tr:nth-child(1) > td.dhxTextCell.standartTreeRow > span"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Actions mouse= new Actions(driver);
		
		mouse.dragAndDrop(src,tgt).perform();
		
	}

}
