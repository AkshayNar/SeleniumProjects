package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import base.BaseClass;
import pomClasses.LaunchPage;

public class VerifyLogin extends BaseClass{
	
	private LaunchPage logIn;
	private WebDriver driver;
	
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeMethod(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = ChromeBrowser();
		}
		else
		{
			driver = FirefoxBrowser();
		}
	}
	
	@BeforeClass
	public void beforeClass()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		logIn = new LaunchPage(driver);
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
	}
	
	
	@Test
	public void test1()
	{
		logIn.putEmailId();
	}
	
	@Test
	public void test2()
	{
		logIn.putPassword();
	}
	
	@Test
	public void test3()
	{
		logIn.clickLoginBtn();
	}
	
	
	
	@AfterClass
	public void afterClass()
	{
		
	}

}
