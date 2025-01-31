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

public class ScreenShotaddingtoreportAssign22012025 {
	@Test
	public void screesnhotintoreport()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		String screen = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark= new ExtentSparkReporter("./HTML_reports/"+System.currentTimeMillis()+"Andaaj.html");
		ExtentReports ext= new ExtentReports();
		ext.attachReporter(spark);
		ExtentTest test = ext.createTest("screesnhotintoreport");
		test.log(Status.PASS, "screnshot adding message");
		test.addScreenCaptureFromBase64String(screen);
		ext.flush();
		
	}

}
