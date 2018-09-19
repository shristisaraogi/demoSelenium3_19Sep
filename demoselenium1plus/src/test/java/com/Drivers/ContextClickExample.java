package com.Drivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.sun.glass.events.KeyEvent;

public class ContextClickExample {
	
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
	public void testcase() throws AWTException, IOException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		System.out.println("Popup closed");
		WebElement src=driver.findElement(By.cssSelector("#container > div > header > div._1tz-RS > div > div > div > div._1Wr4v5 > a > div > span"));
		
		Actions mouse= new Actions(driver);
		mouse.contextClick(src).build().perform();
		
		Robot win=new Robot();
		win.keyPress(KeyEvent.VK_DOWN);
		win.keyPress(KeyEvent.VK_ENTER);
		mouse.contextClick(src).build().perform();
		ScreenShots.getscreenshot(driver, "C:\\Users\\A07208trng_b4a.04.28\\Desktop\\Selenium3Plus\\SST\\TEST1.JPG");
		Robot win1=new Robot();
		win1.keyPress(KeyEvent.VK_DOWN);
		win1.keyPress(KeyEvent.VK_DOWN);
		win1.keyPress(KeyEvent.VK_ENTER);
		
	}

}
