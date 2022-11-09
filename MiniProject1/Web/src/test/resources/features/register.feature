Feature: Register
  As a user
  I want to register my account
  SO I can login with my account

  @Register
  Scenario Outline: Register new account
    Given I am on home page
    And I click icon the login icon
    And I click register text
    When I input "<name>" name
    And I input new "<email>" email
    And I input new "<password>" password
    And I click register  button
    Then I will get "<theresult>"
    Examples:
      | name| email | password | theresult|
      |     |       |          | error message|
      |ronasarigl   |          |              | error message |
      |             | ronasari@gmail.com      |    | error message |
      |             |          |   novtami    | error message |
      |ronasarigl| ronasari@gmail.com |       | error message |
      |          |ronasari@gmail.com| novtami | error message |
      |ronasarigl|        | novtami |error message|
      |ronasarigl|ronasarigl@gmail.com| novtami| successfull registration|

