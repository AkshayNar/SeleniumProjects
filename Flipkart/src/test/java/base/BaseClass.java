package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	public static WebDriver ChromeBrowser()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Velocity Class\\Automation\\Drivers and libraries\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
	
	public static WebDriver FirefoxBrowser()
	{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\Velocity Class\\Automation\\Drivers and libraries\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		
	

}
