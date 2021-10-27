package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ImpMethodes.ImpMethodes;

public class HomePageBeforeLog {
	
	WebDriver driver;
	
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement emailId;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "(//button[@type = 'submit'])[2]")
	private WebElement loginButtonToEnter;
	
	
	public HomePageBeforeLog(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void putEmailId()
	{
		ImpMethodes.expliciteWait(driver, 5, emailId);
		emailId.sendKeys("akshaynarhare1541@gmail.com");
	}
	
	public void putPassword()
	{
		ImpMethodes.expliciteWait(driver, 5, password);
		password.sendKeys("Akshay4582");
	}
	
	public void clickLoginBtn()
	{
		ImpMethodes.expliciteWait(driver, 5, loginButtonToEnter);
		loginButtonToEnter.click();
		
	}
	

}
