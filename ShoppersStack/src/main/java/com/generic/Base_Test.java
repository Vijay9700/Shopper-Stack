package com.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.genericutility.UtilityMethods;

public class Base_Test extends UtilityMethods {
	
//	@BeforeSuite
//	public void beforeSuit()
//	{
//		 report = new ExtentReports(REPORT_PATH+name()+".html");
//	}

	@BeforeClass
	public void start()
	{
		set_property();
		to_Launch_browser();
		maximize();
		implicitWait();
		driver.get(URL);
	}
	
	
	@AfterClass
	public void end()
	{
		driver.quit();
		//test.log(LogStatus.INFO, "Test end successfully");
	}
}
