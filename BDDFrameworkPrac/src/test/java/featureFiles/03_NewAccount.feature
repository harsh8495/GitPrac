@smoke
Feature: Validate new Account creation

  Scenario Outline: Create a new Account for Customer
    Given User open the Guru99 webpage
    And user enters the "<userid>" in the UserID texbox
    And user enters the "<password>" in the Password textbox1
    When user clicks on Login button
    Then user will be redirected to the Homepage
    And user clicks on the New Account
    And user enters the customer ID for Account
    And user selects the Account type
    And user enters the Deposit amount "<amt>"
    When clicks on the submit button
    Then user fetch the Account ID.

    Examples:
      | userid    | password | amt   |
      | mngr26593 | 12!@     | 10000 |
