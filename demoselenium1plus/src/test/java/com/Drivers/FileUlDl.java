package com.Drivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class FileUlDl {
	
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");	
	}
	
	@Test
	public void testcase() throws AWTException, IOException
	{
		WebElement afile = driver.findElement(By.cssSelector("#fileupload > div > div.col-lg-7 > span.btn.btn-success.fileinput-button"));
		WebDriverWait wt=new WebDriverWait(driver,10);
		wt.until(ExpectedConditions.elementToBeClickable(afile));
		afile.click();
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\A07208trng_b4a.04.28\\Desktop\\Selenium3Plus\\testimage.jpg");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        Robot robot = null;
        
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
 
        robot.delay(250);
        /*robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement sfile=driver.findElement(By.cssSelector("#fileupload > table > tbody > tr.template-upload.fade.in > td:nth-child(4) > button.btn.btn-primary.start"));
        wt.until(ExpectedConditions.elementToBeClickable(sfile));
        
        sfile.click();
        
        
		
	}


}
