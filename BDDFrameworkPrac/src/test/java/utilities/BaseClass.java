package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//All the reusable methods can be written under base class.
public class BaseClass
{

	static String browserName;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver()
	{
		try 
		{
			browserName = FetchdatafromProperty.ReadDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			try {
				driver.get(FetchDatafromExcel.Testdata(1, 0));
				driver.manage().window().maximize();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		if(browserName.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
			try {
				driver.get(FetchDatafromExcel.Testdata(1, 0));
				driver.manage().window().maximize();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			try {
				driver.get(FetchDatafromExcel.Testdata(1, 0));
				driver.manage().window().maximize();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		return driver;
	
		
	}
	
	public static String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void addExplicitWait(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}

