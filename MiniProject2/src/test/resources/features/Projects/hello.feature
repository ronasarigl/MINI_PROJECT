Feature: Get index
  As a user
  I want to get index
  So I can manage the index

  Scenario: Get index with valid url
    Given I set the valid url get index
    When I send get request
    Then I will get status code 200