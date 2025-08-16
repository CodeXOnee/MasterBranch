Feature: Home Page Functionality Check

  Scenario: Login Functionality
    Given User is on Home Page
    And User Enters Valid Credentials
    When User Clicks on Login button
    Then User should navigate to Dashboard


  Scenario: Dashboard Functionality
    Given User is on Admin Page
		And User clicks on Add Users button
		When User add User "<user role>" and "<status>" and "<employeename>" and "<username>" and "<password>" and "<confirmpassword>" 
		And Click on save button
		Then User should see Success Message

  Scenario Outline: Test the PIM page functionality
    Given user is on PIM page and valid the PIM page
    When user click on add employee
    Then user add employee "<firstname>" and "<middlename>" and "<lastname>"
    And user click on save button

    Examples: 
      | firstname | middlename | lastname |
      | Ankit     | Ganesh     | Wankhede |

