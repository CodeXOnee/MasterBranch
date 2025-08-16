Feature: Home Page Functionality Check

  Scenario: Login Functionality
    Given User is on Home Page
    And User Enters Valid Credentials
    When User Clicks on Login button
    Then User should navigate to Dashboard

  Scenario Outline: Test the PIM page functionality
    Given user is on PIM page and valid the PIM page
    When user click on add employee
    Then user add employee "<firstname>" and "<middlename>" and "<lastname>"
    And user click on save button

    Examples: 
      | firstname | middlename | lastname |
      | Ankit     | Ganesh     | Wankhede |
