Feature: feature to test login functionality





  Scenario: Check login is successful with a valid id and password
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  