package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.Utility;

public class LaunchPage {
		
	
	
		WebDriver driver;
		
		@FindBy (xpath = "(//input[@type='text'])[2]")
		private WebElement emailId;
		
		@FindBy (xpath = "//input[@type='password']")
		private WebElement password;
		
		@FindBy (xpath = "(//button[@type = 'submit'])[2]")
		private WebElement loginButtonToEnter;
		
		
		public LaunchPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void putEmailId()
		{
			Utility.expliciteWait(driver, 5, emailId);
			emailId.sendKeys("put your own email");
		}
		
		public void putPassword()
		{
			Utility.expliciteWait(driver, 5, password);
			password.sendKeys("put your own password");
		}
		
		public void clickLoginBtn()
		{
			Utility.expliciteWait(driver, 5, loginButtonToEnter);
			loginButtonToEnter.click();
			
		}

}
