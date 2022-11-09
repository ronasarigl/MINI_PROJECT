Feature: Get user information
  As a user
  I want to get information
  So I can see information of the product

  Scenario: Get info products
    Given I set the url to get info
    When I send info request
    Then I will get status code 401
    And I get unauthorized message