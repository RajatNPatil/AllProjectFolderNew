Feature: Test login functionality

  Scenario Outline: Check login successful with valid creds
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login page
    Then user is navigated to the home page

    Examples: 
      | username | password      |
      | student  | Password123   |
      | student2 | Password1234  |
      | student3 | Password12345 |
