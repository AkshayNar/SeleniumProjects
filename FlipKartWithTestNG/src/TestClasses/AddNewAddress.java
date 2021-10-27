package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.HomePage;
import PomClasses.HomePageBeforeLog;
import PomClasses.UserProfilePage;

public class AddNewAddress {
	
	WebDriver driver;
	
	HomePageBeforeLog logIn;
	HomePage home;
	UserProfilePage profile;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Velocity Class\\Automation\\Drivers and libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		logIn = new HomePageBeforeLog(driver);
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
	public void test1()
	{
		home.clickOnGoToMore();
		home.clickOnProfile();
		
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
		
		
	}

}
