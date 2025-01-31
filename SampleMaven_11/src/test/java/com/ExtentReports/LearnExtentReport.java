package com.ExtentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReport {

	@Test
	public void createReport()
	{
		//step1 create instance of Extentspark reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/"+System.currentTimeMillis()+"_ExtentReport.html");
		
		//step2 create instance of Extent report 
		ExtentReports extreport =new ExtentReports();
		
		//step3 attach ExtentsparkReporter to Extent report
		extreport.attachReporter(spark);
 		
		//step4: create instance of Extent Test
		ExtentTest test = extreport.createTest("createReport");
		
		//step5: call log() to provide status and the message
		test.log(Status.PASS, "message added into report");
		test.log(Status.INFO, "addding info status");
		
		//step6: call Flush()
		extreport.flush();
		
		
	}
}
