Feature: Login to the Stackoverflow website
  I want to use this template to validate the credentials of an existing user

  Scenario: Loging to the Stackoverflow website with the valid credentials
    Given User navigates to Stackoverflow website
    And User clicks on Login button
    And User enters valid username
    And User enters valid password
    When User clicks Submit button
    Then User is taken to Home page successfully

    