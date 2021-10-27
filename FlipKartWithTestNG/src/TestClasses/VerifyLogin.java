package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.HomePageBeforeLog;

public class VerifyLogin {
	
	private HomePageBeforeLog logIn;
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Velocity Class\\Automation\\Drivers and libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		logIn = new HomePageBeforeLog(driver);
		
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
