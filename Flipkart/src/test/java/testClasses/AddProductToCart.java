package testClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import utilClasses.Utility;
import pomClasses.HomePage;
import pomClasses.LaunchPage;
import pomClasses.ProductDetailPage;

public class AddProductToCart extends BaseClass{
	
WebDriver driver;
	
	LaunchPage logIn;
	HomePage home;
	ProductDetailPage productDetails;
	
	int r=1;
	int c=1;
	
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeMethod(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = ChromeBrowser();
			Thread.sleep(7000);
		}
		else
		{
			driver = FirefoxBrowser();
		}
	}
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		logIn = new LaunchPage(driver);
		home = new HomePage(driver);
		productDetails = new ProductDetailPage(driver);
		
		logIn.putEmailId();
		logIn.putPassword();
		logIn.clickLoginBtn();
		
		Thread.sleep(3000);
		
	}
	
	
	
	@Test (invocationCount = 3)
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		String searchText = Utility.getDataFromXcelSheet("Sheet1", r, c);
		
		System.out.println(searchText);
		
		home.searchText(searchText);
		home.clickSearchButton();
		home.clickOnFirstMobile();
		
		this.driver = Utility.childBrowser(driver);
		
		productDetails.clickAddToCart(driver);
		
		driver.close();
		
		this.driver = Utility.mainPage(driver);
		
		home.searchBoxClr(searchText);
		Thread.sleep(3000);
		r++;
		
	}
	
	
	
	@AfterClass
	public void afterClass()
	{
		
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
	}

}
