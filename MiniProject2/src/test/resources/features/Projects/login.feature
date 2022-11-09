Feature: Login
  As a user
  I want to login my account
  So I can access the feature

  Scenario: Login with valid email and password
    Given I set url user login
    And I Set valid email and password
    When I send the request
    Then I will get status code 200

  Scenario: Login with invalid email and password
    Given I set url user login
    And I Set invalid email and password
    When I send the request
    Then I will get status code 400
    And I get error record not found message

  Scenario: Login with null email and password
    Given I set url user login
    And I Set null email and password
    When I send the request
    Then I will get status code 400
    And I get error email is required message

  Scenario: Login with valid email and invalid password
    Given I set url user login
    And I Set valid email and invalid password
    When I send the request
    Then I will get status code 400
    And I get error email or password is invalid message

  Scenario: Login with invalid email and valid password
    Given I set url user login
    And I Set invalid email and valid password
    When I send the request
    Then I will get status code 400
    And I get error email or password is invalid message
