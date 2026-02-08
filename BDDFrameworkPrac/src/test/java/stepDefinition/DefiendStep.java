package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditCustomer;
import pages.LoginPage;
import pages.NewAccount;
import pages.NewCustomer;
import utilities.BaseClass;
import utilities.FetchDatafromExcel;
import utilities.WritedatatoExcel;

public class DefiendStep extends BaseClass
{
	WebDriver driver = BaseClass.initializeDriver();
	LoginPage obj = new LoginPage(driver);
	NewCustomer obj1= new NewCustomer(driver);
	EditCustomer obj2 = new EditCustomer(driver);
	NewAccount obj3 = new NewAccount(driver);
	
	String CustomerID;
	String CusID;
	
	@Given("User open the Guru99 webpage")
	public void user_open_the_guru99_webpage() {
		getTitle();
	    	}

	@Given("user enters the {string} in the UserID texbox")
	public void user_enters_the_in_the_user_id_texbox(String userid) 
	{
		obj.enterUsername(userid);
	    	}

	@Given("user enters the {string} in the Password textbox1")
	public void user_enters_the_in_the_password_textbox1(String password)
	{
		obj.enterPassword(password);
		System.out.println("Hello");
	}
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() 
	{
	obj.clickLogin();	
	    	}

	@Then("user will be redirected to the Homepage")
	public void user_will_be_redirected_to_the_homepage() 
	{
		String str1= getTitle();
		if(str1.contains("Guru99"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
		
			
	}

	@Then("user clicks on new customer link")
	public void user_clicks_on_new_customer_link() 
	{
		obj1.navigateNewCustomer();
	    	}

	@Then("user enters the {string} in  customer name field")
	public void user_enters_the_in_customer_name_field(String cust_name) 
	{
		obj1.Entername(cust_name);
	    	}

	@Then("user selects the gender")
	public void user_selects_the_gender() 
	{
		obj1.SelectGender();
	    	}

	@Then("user enters the {string} in the date of birth field")
	public void user_enters_the_in_the_date_of_birth_field(String dob) 
	{
		obj1.EnterDOb(dob);
	}

	@Then("user enters the {string} in the address field")
	public void user_enters_the_in_the_address_field(String address) 
	{
		obj1.EnterAddr(address);
	}

	@Then("user enters the {string} in the city textbox")
	public void user_enters_the_in_the_city_textbox(String city) {
	    
		obj1.EnterCity(city);
		
	}


	@Then("user enters the {string} in the state textbox")
	public void user_enters_the_in_the_state_textbox(String state) 
	{
		obj1.EnterState(state);
	    	}

	@Then("user enters the {string} in the PIN textbox")
	public void user_enters_the_in_the_pin_textbox(String PIN)
	{
		obj1.EnterPin(PIN);
	    	}

	@Then("user enters the {string} in the mobile number textbox")
	public void user_enters_the_in_the_mobile_number_textbox(String MobileNo) 
	{
		obj1.EnterMobile(MobileNo);
	    
	}

	@Then("user enters the {string} in the Mail iD textbox")
	public void user_enters_the_in_the_mail_i_d_textbox(String Email) 
	{	
	 int random = (int) (Math.random()*1000);	
	 obj1.EnterEmail(random+Email);   
	}

	@Then("user enters the {string} in the password textbox")
	public void user_enters_the_in_the_password_textbox(String password1) 
	{
		obj1.EnterPass(password1);
	    	}

	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button()
	{
		obj1.clickSubmit();
	    	}

	@Then("Validate the customer creation")
	public void validate_the_customer_creation() 
	{
		String str1 = obj1.getConfim();
		if(str1.equalsIgnoreCase("Customer Registered Successfully!!!"))
		{
			System.out.println(str1);
		}
		else
		{
			System.out.println("Error occured");
		}
	}

	@Then("user retrieve the customer ID")
	public void user_retrieve_the_customer_id() 
	
	{
		CustomerID = obj1.getID();
		try {
			WritedatatoExcel.WriteCustomerID(CustomerID);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(CustomerID);
		
		
	   	}
	
	@Then("user clicks on the Edit customer")
	public void user_clicks_on_the_edit_customer() 
	{
		obj2.goEdit();
	    
	}

	@Then("user enters the Customer ID")
	public void user_enters_the_customer_id() 
	{
		try {
			CusID=FetchDatafromExcel.readCustomerID();
		} catch (IOException e) {
				e.printStackTrace();
		}
		obj2.enterID(CusID);
	}

	@Then("user clicks on Submit button")
	public void user_clicks_on_submit_button() 
	{
		obj2.IDsubmit();
	}

	@Then("User edits the {string}")
	public void user_edits_the(String address)
	{
		obj2.EditAddress(address);
	}

	@Then("user edits the city {string}")
	public void user_edits_the_city(String city) {
	    
		obj2.EditCity(city);
	}


	@Then("user clicks on the New Account")
	public void user_clicks_on_the_new_account() {
	   
	obj3.Accountpage();	
		
	}

	@Then("user enters the customer ID for Account")
	public void user_enters_the_customer_id_for_Account()
	{
		try {
			CusID=FetchDatafromExcel.readCustomerID();
		} catch (IOException e) {
				e.printStackTrace();
		}		
		obj3.CustID(CusID);
	}

	@Then("user selects the Account type")
	public void user_selects_the_account_type() 
	{
	   obj3.typeAccount(); 
	}


	@Then("user enters the Deposit amount {string}")
	public void user_enters_the_deposit_amount(String amt) 
	{
	  obj3.AccountDepo(amt);  
	}




	@When("clicks on the submit button")
	public void clicks_on_the_submit_button()
	{
		obj3.AccountSub();
	}

	@Then("user fetch the Account ID.")
	public void user_fetch_the_account_id()
	{
		String accountID= obj3.AccountID();
		System.out.println(accountID);
	}

	
}
