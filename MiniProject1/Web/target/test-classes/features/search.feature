Feature: Search
  As a user
  I want search product with my account
  SO I can get the product

  @search
  Scenario: Search product
    Given I have logged in my account
    When I click select button
    And I click gaming button
    Then I will get product is empty message
