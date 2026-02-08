package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EditCustomer extends BaseClass
{
WebDriver driver;
	
	public EditCustomer (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement editCust;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement editCustIDLogin;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement editCustSubmit;
	
	@FindBy(xpath="//input[@name='res']")
	WebElement editCustReset;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement editCustAddr;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement editCustCity;
	
	
	public void goEdit()
	{
		editCust.click();
	}
	
	public void enterID(String ID)
	{
		editCustIDLogin.sendKeys(ID);
	}
	
	public void IDsubmit()
	{
		editCustSubmit.click();
	}
	
	public void EditAddress(String Address)
	{
		editCustAddr.clear();
		editCustAddr.sendKeys(Address);
	}
	public void EditCity(String city)
	{
		editCustCity.clear();
		editCustCity.sendKeys(city);
	}
	
	
	
	
}
