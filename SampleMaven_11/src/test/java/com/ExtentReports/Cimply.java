package com.ExtentReports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Cimply {
	
	@Test
	
	public void screen()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		String screen = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/"+System.currentTimeMillis()+"");
		ExtentReports ext= new ExtentReports();
		ext.attachReporter(spark);
		ExtentTest test = ext.createTest("screen");
		test.log(Status.PASS, "Adding screenshot into report");
		test.addScreenCaptureFromBase64String(screen);
		ext.flush();
		
		
		
	}
	

}
