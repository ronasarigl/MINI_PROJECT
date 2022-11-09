Feature: Logout
  As a user
  I want logout my account
  SO I can manage my account

  @Logout
  Scenario: Logout acccount
    Given I have logged in
    When I click profile icon
    And I click logout text
    Then I will go back to login page
