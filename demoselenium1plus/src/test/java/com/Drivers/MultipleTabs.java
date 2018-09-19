package com.Drivers;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTabs {
	WebDriver driver;
	String browsertest="chrome";
	
	@BeforeMethod
	public void openbrowser(){
		driver=Browser.getdriver(browsertest);
		driver.manage().window().maximize();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");	
	}
	
	@Test
	public void testcase(){
		String mwid=driver.getWindowHandle();
		
		 Set<String> windowids=driver.getWindowHandles();	
		 for(String x:windowids)
		 {
			 
			 if(!x.equals(mwid))
			 {
			  driver.switchTo().window(x);
			  driver.close();
			 }
			 
		 }
			 
	}

}
