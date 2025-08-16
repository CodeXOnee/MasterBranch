Feature: Home Page Functionality Check

  Scenario: Login Functionality
    Given User is on Home Page
    And User Enters Valid Credentials
    When User Clicks on Login button
    Then User should navigate to Dashboard

  Scenario Outline: Dashboard Functionality
    Given User is on Dashboard Page and User clicks on Admin button
    And User clicks on Add Users button
    When User add User "<userrole>" and "<status>" and "<employeename>" and "<username>" and "<password>" and "<confirmpassword>"
    And Click on save button
    Then User should see Success Message

    Examples: 
      | userrole | status  | employeename | username      | password   | confirmpassword |
      | Admin    | Enabled | Yash Purohit | YashPurohit98 | Yashg@1379 | Yash@1379       |
