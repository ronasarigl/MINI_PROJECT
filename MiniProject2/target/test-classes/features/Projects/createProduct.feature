Feature: Create Product
  As a user
  I want to create the a product
  So I can manage my product

  Scenario: Create a comment product with url
    Given I set url to create a comment product
    And I set body Content
    When I send a comment request
    Then I will get status code 401
    And  I get unauthorized message

  Scenario: Assign product with url
    Given I set url to assign a product rating
    And I set body ratings
    When I send a assign product request
    Then I will get status code 401
    And  I get unauthorized message