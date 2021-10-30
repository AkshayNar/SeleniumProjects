package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver ChromeBrowser()
	{
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browsers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			driver.manage().window().maximize();
			return driver;
		}
	
	public static WebDriver FirefoxBrowser()
	{
			System.setProperty("webdriver.gecko.driver", "src\\\\test\\\\resources\\\\Browsers\\\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		
			driver.manage().window().maximize();
			return driver;
		}
		
		
	

}
