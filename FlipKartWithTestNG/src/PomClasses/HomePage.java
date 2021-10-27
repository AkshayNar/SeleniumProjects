package PomClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ImpMethodes.ImpMethodes;

public class HomePage {
	
WebDriver driver;
	

	//------------ Search Products Elements ------------------------
	@FindBy (xpath = "//input[@title = 'Search for products, brands and more']")
	private WebElement searchText;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy (xpath = "(//div[@class = '_2kHMtA'])[2]")
	private WebElement firstProduct;
	
	
	//------------------ Add Address Elements ------------------------
	@FindBy (xpath = "//div[text()='Akshay']")
	private WebElement goToMore;
	
	@FindBy (xpath = "(//li[@class='_2NOVgj'])[1]")
	private WebElement profileBtn;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchText(String src)
	{
		ImpMethodes.expliciteWait(driver, 5, searchText);
		searchText.sendKeys(src);
	}
	
	public void searchBoxClr(String input)
	{
		for(int i=0; i<input.length(); i++)
		
		searchText.sendKeys(Keys.BACK_SPACE);
	}
	
	
	public void clickSearchButton() throws InterruptedException
	{
		ImpMethodes.expliciteWait(driver, 5, searchBtn);
		searchBtn.click();
		
		Thread.sleep(3000);
	}
	
	
	public void clickOnFirstMobile()
	{
		ImpMethodes.expliciteWait(driver, 5, firstProduct);
		firstProduct.click();
	}
	
	
	public void clickOnGoToMore()
	{
		Actions act = new Actions(driver);
		
		ImpMethodes.expliciteWait(driver, 5, goToMore);
		act.moveToElement(goToMore).build().perform();
		
		ImpMethodes.expliciteWait(driver, 5, profileBtn);
		act.moveToElement(profileBtn).build().perform();
	}
	
	public void clickOnProfile()
	{
		ImpMethodes.expliciteWait(driver, 5, profileBtn);
		profileBtn.click();
	}
	
	
	
	
	
	

}
