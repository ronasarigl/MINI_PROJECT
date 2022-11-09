@Cart
Feature: Add Product
  As a user
  I want added product to my cart
  SO I can manage the product


  Scenario: Add product to cart
    Given I have logged in first
    When I click beli button
    Then the product will be added to cart icon

  Scenario: Add second product to cart
    Given I have logged in first
    When I click beli button
    And I I click second beli button
    Then the product will be added to cart

