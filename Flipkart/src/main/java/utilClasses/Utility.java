package utilClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
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
	
	public static String getDataFromXcelSheet(String sheetName, int row, int column) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Products.xlsx");
		
		String searchText = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		
		return searchText;
			
	}

}
