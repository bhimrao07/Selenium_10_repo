package com.Bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HondaTest {
	public WebDriver driver;
	@Test
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.honda2wheelersindia.com/");
		Reporter.log(driver.getCurrentUrl()+""+driver.getTitle(),true);
		Reporter.log("Honda",true);
	}
}
