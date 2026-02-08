@smoke
Feature: Validate the functionality of new customer.

  Scenario Outline: Create a New Customer
    Given User open the Guru99 webpage
    And user enters the "<userid>" in the UserID texbox
    And user enters the "<password>" in the Password textbox1
    When user clicks on Login button
    Then user will be redirected to the Homepage
    And user clicks on new customer link
    And user enters the "<cust_name>" in  customer name field
    And user selects the gender
    And user enters the "<dob>" in the date of birth field
    And user enters the "<address>" in the address field
    And user enters the "<city>" in the city textbox
    And user enters the "<state>" in the state textbox
    And user enters the "<PIN>" in the PIN textbox
    And user enters the "<MobileNo>" in the mobile number textbox
    And user enters the "<Email>" in the Mail iD textbox
    And user enters the "<password1>" in the password textbox
    And user clicks on the submit button
    Then Validate the customer creation
    And user retrieve the customer ID

    Examples:
      | userid    | password | cust_name | dob        | address   | city   | state       | PIN     | MobileNo   | Email              | password1 |
      | mngr26593 | 12!@     | TestA     | 08/09/1999 | Link Road | Mumbai | Maharashtra | 4000061 | 8976815487 | testuser@gmail.com | abc@123   |
