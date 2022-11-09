Feature: Login
  As a user
  I want to login with my account
  SO I can access home page

  @Login
  Scenario Outline: Login with email and password
    Given I am on home page
    And I click icon the login icon
    When I click field email
    And I input "<email>" email
    And I click field password
    And I input "<password>" password
    And I click the login button
    Then I will get "<result>"
    Examples:
      | email | password | result|
      |       |          | can't login |
      |       |  novtami | can't login because email error message|
      |       |  na | can't login because email error message|
      | rona  |     | can't login because password error message |
      | ronasari@gmail.com      |          | can't login because password error message |
      | ronasari@gmail.com      |  na        | can't login because invalid  email or password |
      | ronasari@gmail.com | novtami   | can login and main page displayed |
