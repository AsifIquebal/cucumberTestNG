@browser,@amazon_search
Feature: Demo Scenario Outlines feature file
  As a user
  I want to use Amazon website to search for products
  So that i can analyze the search result

  Scenario Outline: <product>
    Given User open browser and  navigates to "https://www.amazon.in/"
    Then User searches for "<product>"
    #Then User closes browser
    Examples:
      | product      |
      | Smart Phones |
      | Laptop       |
      | Desktop      |
