package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature",glue="com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict=false,
plugin = {"html:Report/HTML_Report",
		"pretty",
		"json:Report/JSON_Report.json"})//Key and Value pair


public class Test_Runner {

	public static WebDriver driver;

	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		driver = Base_Class.launchBrowser(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		Base_Class.close();
	}
}
