package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class NewAccount extends BaseClass
{
	
	WebDriver driver;
	
	public NewAccount (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement AccountLink;
	
	@FindBy(xpath="//input[@name='cusid']")
	WebElement AccountCusID;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement AccountType;
	
	@FindBy(xpath="//input[@name='inideposit']")
	WebElement AccountDeposit;
	
	@FindBy(xpath="//input[@value='submit']")
	WebElement AccountSubmit;
	
	@FindBy(xpath="//input[@value='reset']")
	WebElement AccountReset;
	
	@FindBy(xpath="//td[text()='Account ID']/following-sibling::td")
	WebElement AccountNos;
	
	
	public void Accountpage()
	{
		AccountLink.click();	
	}
	
	public void CustID(String cusID)
	{
		AccountCusID.sendKeys(cusID);	
	}
	
	public void typeAccount()
	{
		 Select dropdown = new Select(AccountType);
		 dropdown.selectByVisibleText("Savings");
		 
	}
	public void AccountDepo(String amount)
	{
		AccountDeposit.sendKeys(amount);
	}
	
	public void AccountSub()
	{
		AccountSubmit.click();
	}
	public String AccountID()
	{
		String AccID= AccountNos.getText();
		return AccID;
	}
	
	
	
	
	
}
