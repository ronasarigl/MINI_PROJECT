Feature: Check added products
  As a user
  I want check added products
  SO I can check the products

  @Cart
  Scenario: Check a product
    Given I have logged in first
    When I click cart button
    Then I will get added products
