Feature: Login
  As a user
  I want to login with my account
  SO I can access home page

  @Login
  Scenario Outline: Login with email and password
    Given I am on home page
    And I click icon the login icon
    When I input "<email>" email
    And I input "<password>" password
    And I click login button
    Then I will get the "<result>"
  Examples:
    | email | password | result|
    |       |          | can't login |
    |       |  novtami | can't login |
    |       |  na | can't login |
    | rona  |     | can't login |
    | ronasari@gmail.com      |          | can't login |
    | ronasari@gmail.com      |  na        | can't login |
    | ronasari@gmail.com | novtami   | can login |
    | ro    |    na    | can't login |
    |  ro   | novtami  | can't login |
