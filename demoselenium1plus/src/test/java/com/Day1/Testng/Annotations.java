package com.Day1.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void startsuite(){
		System.out.println("=========");
		System.out.println("Start of Suite");
	}
	
	@AfterSuite
	public void stoptsuite(){
		System.out.println("=========");
		System.out.println("End of Suite");
	}
	
	
	
	@BeforeClass
	public void startserver(){
		System.out.println("=========");
		System.out.println("Server started");
	}
	
	@AfterClass
	public void stoptserver(){
		System.out.println("=========");
		System.out.println("Server stoped");
	}
		
	
	@Test
	public void alpha() {
		System.out.println("My 1st test case");
	}
	
	@Test
	public void beta() {
		System.out.println("My 2nd test case");
	}
	
	@BeforeMethod
	public void opebrowser(){
		System.out.println("Opening the browser");
	}
	
	@AfterMethod
	public void closebrowser(){
		System.out.println("Close the browser");
	}

}
