package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ImpMethodes.ImpMethodes;

public class UserProfilePage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//div[text()='Manage Addresses']")
	private WebElement manageAddressText;
	
	@FindBy (xpath = "//div[text()='ADD A NEW ADDRESS']")
	private WebElement addNewAddresstext;
	
	@FindBy (xpath = "//input[@name='name']")
	private WebElement addressName;
	
	@FindBy (xpath = "//input[@name='phone']")
	private WebElement AddressMobNumber;
	
	@FindBy (xpath = "//input[@name='pincode']")
	private WebElement addressPincode;
	
	@FindBy (xpath = "//input[@name='addressLine2']")
	private WebElement addressLocality;
	
	@FindBy (xpath = "//textarea[@name='addressLine1']")
	private WebElement address;
	
	@FindBy (xpath = "//select[@name='state']")
	private WebElement state;
	
	@FindBy (xpath = "//label[@for='HOME']")
	private WebElement addressType;
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement addressSaveBtn;

	public UserProfilePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnManageAddresstext()
	{
		ImpMethodes.expliciteWait(driver, 5, manageAddressText);
		manageAddressText.click();
	}
	
	public void clickOnNewAddressText()
	{
		ImpMethodes.expliciteWait(driver, 5, addNewAddresstext);
		addNewAddresstext.click();
	}
	
	public void addName()
	{
		ImpMethodes.expliciteWait(driver, 5, addressName);
		addressName.sendKeys("Akshay Narhare");
	}
	
	public void addMobileNumber()
	{
		ImpMethodes.expliciteWait(driver, 5, AddressMobNumber);
		AddressMobNumber.sendKeys("9673743951");
	}
	
	public void addPincode()
	{
		ImpMethodes.expliciteWait(driver, 5, addressPincode);
		addressPincode.sendKeys("411041");
	}
	
	public void addLocality()
	{
		ImpMethodes.expliciteWait(driver, 5, addressLocality);
		addressLocality.sendKeys("Nanded City");
	}
	
	public void addAddress()
	{
		ImpMethodes.expliciteWait(driver, 5, address);
		address.sendKeys("G-404, Janaranjani-B, Nanded City, pune");
	}
	
	public void selectState()
	{
		Select sel = new Select(state);
		
		ImpMethodes.expliciteWait(driver, 5, state);
		
		sel.selectByVisibleText("Maharashtra");
	}
	
	public void selectTypeOfAddtess()
	{
		ImpMethodes.expliciteWait(driver, 5, addressType);
		addressType.click();
	}
	
	public void saveAddress()
	{
		ImpMethodes.expliciteWait(driver, 5, addressSaveBtn);
		addressSaveBtn.click();
	}
	
	
	
	
	
	

}
