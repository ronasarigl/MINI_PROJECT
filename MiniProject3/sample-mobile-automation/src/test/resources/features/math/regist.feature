Feature: Register
  As a user
  I want to register my account
  SO I can login with my account

  @Register
  Scenario Outline: Register new account
    Given I am on home page
    And I click login icon
    And I click register text
    When I click field fullname
    And I input "<name>" name
    And I click field new email
    And I input new "<email>" email
    And I click field new password
    And I input new "<password>" password
    And I click register  button
    Then I  get "<theresult>"
    Examples:
      | name| email | password | theresult|
      |     |       |          | can't register account|
      |ronasarigl   |          |              | can't register account because email and password error |
      |             | ronasari@gmail.com      |    | can't register account because name and password error|
      |             |          |   novtami    | can't register account because name and email error |
      |          |ronasari@gmail.com| novtami | can't register account  because name error |
      |ronasarigl|        | novtami |can't register account  because email error |
      |ronasarigl|ronasarigl@gmail.com| novtami| successfull registration and main page displayed|

