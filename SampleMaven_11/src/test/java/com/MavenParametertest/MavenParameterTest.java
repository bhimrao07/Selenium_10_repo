package com.MavenParametertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParameterTest {
	
	@Test
	public void launch()
	{
		String url=System.getProperty("url");
		Reporter.log(url,true);
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
	}

}
