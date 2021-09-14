Feature: Scenario Outlines feature file

  Scenario Outline: <product>
    Given User open browser and  navigates to "https://www.amazon.in/"
    Then User searches for "<product>"
    Then User closes browser
    Examples:
      | product      |
      | Smart Phones |
      | Laptop       |
      | Desktop      |
