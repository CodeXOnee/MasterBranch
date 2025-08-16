Feature: Test the Open HRM application

  Scenario Outline: test the LoginPage functionality
    Given user open hrm application
    When user enter valid "<user>" and "<password>" and then click on login button

    Examples: 
      | user  | password |
      | Admin | admin123 |
