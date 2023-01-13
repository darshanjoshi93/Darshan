Feature: feature to test google search functionality

  Scenario: validate whether google search is working or not
    Given browser is open
    And user is on google search page
    When user is enterd a text in search box
    And hits enter button
    Then user is navigated to search result page
