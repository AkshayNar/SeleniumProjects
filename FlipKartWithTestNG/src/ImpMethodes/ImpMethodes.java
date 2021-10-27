package ImpMethodes;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpMethodes {

	
	public static void expliciteWait(WebDriver driver, int Time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Time);
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebDriver childBrowser(WebDriver driver)
	{
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		return driver.switchTo().window(windows.get(1));
	}
	
	public static WebDriver mainPage(WebDriver driver)
	{
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
	
		
		return driver.switchTo().window(windows.get(0));
	}
	
}
