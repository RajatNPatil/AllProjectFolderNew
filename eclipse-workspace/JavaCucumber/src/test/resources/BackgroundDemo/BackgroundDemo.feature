Feature: Check home page functionality

  Background: user is logged in
    Given user is logged in
    When user enters username and password
    And clicks on login button
    Then user is naviated to the homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
