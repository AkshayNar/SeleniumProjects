package TestClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ImpMethodes.ImpMethodes;
import PomClasses.HomePage;
import PomClasses.HomePageBeforeLog;
import PomClasses.MobileDetailPage;

public class AddMobileToCart {
	
	WebDriver driver;
	
	HomePageBeforeLog logIn;
	HomePage home;
	MobileDetailPage productDetails;
	
	int r=1;
	int c=1;
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Velocity Class\\Automation\\Drivers and libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		logIn = new HomePageBeforeLog(driver);
		home = new HomePage(driver);
		productDetails = new MobileDetailPage(driver);
		
		logIn.putEmailId();
		logIn.putPassword();
		logIn.clickLoginBtn();
		
		Thread.sleep(3000);
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		
	}
	
	
	@Test (invocationCount = 3)
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Products.xlsx");
		
		String searchText = WorkbookFactory.create(file).getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
		
		home.searchText(searchText);
		home.clickSearchButton();
		home.clickOnFirstMobile();
		
		this.driver = ImpMethodes.childBrowser(driver);
		
		productDetails.clickAddToCart(driver);
		
		driver.close();
		
		this.driver = ImpMethodes.mainPage(driver);
		
		home.searchBoxClr(searchText);
		Thread.sleep(3000);
		r++;
		
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
