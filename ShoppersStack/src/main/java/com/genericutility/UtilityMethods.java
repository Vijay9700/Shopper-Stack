package com.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods implements FrameworkConstants {
	
	public static WebDriver driver;
	public static WebElement element;
	public static Actions act;
	public static JavascriptExecutor executor;
	public static TakesScreenshot ts;
//	public static ExtentReports report;
//	public static ExtentTest test;
	
	
	
	public void initObject()
	{
		act = new Actions(driver);
		executor=(JavascriptExecutor) driver;
		ts=(TakesScreenshot)driver;	
	}
	
	public static String name() {
		LocalDateTime sysdate=LocalDateTime.now();
		String name=sysdate.toString().replace(":", "-");
		return name;
	}
	
	public String get_Title()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public String get_url()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public void click(WebElement element_To_Click)
	{
		element_To_Click.click();
	}
	
	public static String to_Take_ScreenShot(String name) {
		
		String imgpath=SCREENSHOT_PATH+name+".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(SCREENSHOT_PATH+name+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+imgpath;
	}
	
	public static String to_Take_Screenshot(WebElement element,String name)
	{
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg=new File(SCREENSHOT_PATH+name+".png");
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}
	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(TIMEOUTS, TimeUnit.SECONDS);
	}
	
	public static void to_Launch_browser()
	{
		driver=new ChromeDriver();
	}
	public static void set_property()
	{
		System.setProperty(CHROMEKEY, CHROMEPATH);
	}
	
	
	
	

}