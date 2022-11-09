Feature: Get Products
  As a user
  I want to get the product
  So I can see the product

  Scenario: Get all products
    Given I set the url to get all products
    When I send request
    Then I will get status code 200

  Scenario: Get product ratings
    Given I set valid url
    When I send request product ratings
    Then I will get status code 200

  Scenario: Get product comments
    Given I set valid url comments
    When I send request comment
    Then I will get status code 200


