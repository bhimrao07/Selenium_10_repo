package com.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void launch()
	{
		Reporter.log("Test executed",true);
	}
}
