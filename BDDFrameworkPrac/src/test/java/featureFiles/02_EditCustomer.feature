@smoke
Feature: Validate the Edit functionality

  Scenario Outline: Edit the details of New Customer
    Given User open the Guru99 webpage
    And user enters the "<userid>" in the UserID texbox
    And user enters the "<password>" in the Password textbox1
    When user clicks on Login button
    Then user will be redirected to the Homepage
    And user clicks on the Edit customer
    And user enters the Customer ID
    And user clicks on Submit button
    And User edits the "<address>"
    And user edits the city "<city>"

    Examples:
      | userid    | password | address | city |
      | mngr26593 | 12!@     | MG ROAD | Pune |
