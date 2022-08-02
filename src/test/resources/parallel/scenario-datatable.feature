@dt
Feature: Cucumber Learning Session

  Scenario: Data Table Conversion
    Given the following datatable and convert to list
      | name            | position         | office        |
      | Tiger Nixon     | System Architect | Edinburgh     |
      | Garrett Winters | Accountant       | Tokyo         |
      | Asif 1          | Tester           | San Francisco |
    Given the following datatable and convert to map
      | name            | position         | office        |
      | Tiger Nixon     | System Architect | Edinburgh     |
      | Garrett Winters | Accountant       | Tokyo         |
      | Asif 1          | Tester           | San Francisco |
    Given the following datatable and convert to pojo with DataTableTypeAnnotation
      | name            | position         | office        |
      | Tiger Nixon     | System Architect | Edinburgh     |
      | Garrett Winters | [anonymous]      | Tokyo         |
      | Asif 1          | Tester           | San Francisco |
