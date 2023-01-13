Feature: To test user is able to checkout mobile from flipkart

  Scenario: Validate whether is user is able to check out a mobile form flipkart
    When brower is open
    And user is navigate to flipkart homepage
    When user clicks on mobile category
    And user is navigate to mobile category page
    Then user select a mobile
    And Validate whether user is bying a mobile phone
