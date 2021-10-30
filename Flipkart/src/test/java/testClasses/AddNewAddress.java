package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pomClasses.HomePage;
import pomClasses.LaunchPage;
import pomClasses.UserProfilePage;

public class AddNewAddress extends BaseClass{
	
WebDriver driver;
	
	LaunchPage logIn;
	HomePage home;
	UserProfilePage profile;
	
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser)
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
		logIn = new LaunchPage(driver);
		home = new HomePage(driver);
		profile = new UserProfilePage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		logIn.putEmailId();
		logIn.putPassword();
		logIn.clickLoginBtn();
		
		Thread.sleep(3000);
	}
	
	
	@Test
	public void test1() throws InterruptedException
	{
		home.clickOnGoToMore();
		
		profile.clickOnManageAddresstext();
		profile.clickOnNewAddressText();
		profile.addName();
		profile.addMobileNumber();
		profile.addPincode();
		profile.addLocality();
		profile.addAddress();
		profile.selectState();
		profile.selectTypeOfAddtess();
		profile.saveAddress();
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		
	}
	
	@AfterClass
	public void afterClass()
	{
		
		driver.close();
	}

}
