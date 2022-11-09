Feature: Logout
  As a user
  I want logout my account
  SO I can manage my account

  @Logout
  Scenario: Logout account
    Given I have logged in
    When I click logout icon
    Then I will go back to login page
