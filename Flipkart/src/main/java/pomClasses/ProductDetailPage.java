package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilClasses.Utility;

public class ProductDetailPage {
	
WebDriver driver;
	
	@FindBy (xpath = "//li[@class='col col-6-12']")
	private WebElement addToCartBtn;

	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAddToCart(WebDriver driver) throws InterruptedException
	{
		
		Utility.expliciteWait(driver, 5, addToCartBtn);
		addToCartBtn.click();
		
		Thread.sleep(3000);
	}

}
