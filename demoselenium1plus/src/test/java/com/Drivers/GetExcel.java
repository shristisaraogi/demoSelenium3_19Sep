package com.Drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class GetExcel {
	
	WebDriver driver;
	String browsertest="chrome";
	
	@Test(dataProvider="getdata")
	public void testcase(String cname, String pwd) 
	{
		
		System.out.println(cname+"======"+ pwd);
	}
	
	
	@DataProvider
	public Object[][] getdata(){
		
		ShineXlsReader xls=new ShineXlsReader("C:\\Users\\A07208trng_b4a.04.28\\Desktop\\Selenium3Plus\\TestData.xlsx");
		
		int rcount= xls.getRowCount("Sheet1");
		int ccount=xls.getColumnCount("Sheet1");
		
		Object[][] data= new Object[rcount][ccount];
		
		for (int i=2; i<rcount+1; i++){
		
			for (int j=0;j<ccount;j++)
			{
				data[i-2][j]=xls.getCellData("Sheet1", j, i);
				
			}
		}
		
		return data ;
	}

}
