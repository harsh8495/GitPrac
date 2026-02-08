package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NewCustomer extends BaseClass
{

	WebDriver driver;
	
	public NewCustomer (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NewCustLink;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement CustName;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement PIN;
	
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobile;
	
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement submit;
	
	@FindBy(xpath="//input[@name='res']")
	WebElement Reset;
	
	@FindBy(xpath="//td[@colspan='2']/p")
	WebElement ValidateCustomer;
	
	@FindBy(xpath="//td[text()='Customer ID']/following-sibling::td")
	WebElement CustID;
	
	public void navigateNewCustomer()
	{
		NewCustLink.click();
	}
	
	public void Entername(String name)
	{
		CustName.sendKeys(name);
	}
	
	public void SelectGender()
	{
		Gender.click();
	}
	
	public void EnterDOb(String DateofBirth)
	{
		DOB.sendKeys(DateofBirth);
	}
	
	public void EnterAddr(String Add)
	{
		Address.sendKeys(Add);;
	}
	public void EnterCity(String CustCity)
	{
		City.sendKeys(CustCity);
	}
	public void EnterState(String CustState)
	{
		State.sendKeys(CustState);
	}
	public void EnterPin(String CustPin)
	{
		PIN.sendKeys(CustPin);
	}
	public void EnterMobile(String CustMobile)
	{
		mobile.sendKeys(CustMobile);
	}
	public void EnterEmail(String CustEmail)
	{
		email.sendKeys(CustEmail);
	}
	public void EnterPass(String CustPWD)
	{
		password.sendKeys(CustPWD);
	}
	public void clickSubmit()
	{
		submit.click();
	}
	public void clickReset()
	{
		Reset.click();
	}
	
	public String getConfim()
	{
		String header = ValidateCustomer.getText();
		return header;
	}
	
	public String getID()
	{
		String ID = CustID.getText();
		return ID;
	}
	
}



