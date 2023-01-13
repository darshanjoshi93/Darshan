Feature: To test the login functionality of flipkart

  Scenario: Validate the whether user is able to login into flipkart
    Given browser is open
    And User is in login page
    When user enters valid email and password
    And user clicks on login button
    Then user is able to view the flipkart homepage
   And user is able to see the title on consle
