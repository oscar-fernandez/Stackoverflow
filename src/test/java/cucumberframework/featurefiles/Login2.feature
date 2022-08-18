Feature: Login to the Stackoverflow website
  I want to use this template to validate the credentials of an existing user

  Scenario: Loging to the Stackoverflow website with the valid credentials2
    Given User navigates to Stackoverflow website2
    And User clicks on Login button2
    And User enters valid username2
    And User enters valid password2
    When User clicks Submit button2
    Then User is taken to Home page successfully2

    