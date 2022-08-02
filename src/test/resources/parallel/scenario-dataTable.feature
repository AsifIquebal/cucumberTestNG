Feature: Cucumber Learning Session

  #remove hooks for webdriver (if any) before running
  @dt
  Scenario: Data Table Conversion
#    Given the following datatable and convert to list
#      | name            | position         | office        |
#      | Tiger Nixon     | System Architect | Edinburgh     |
#      | Garrett Winters | Accountant       | Tokyo         |
#      | Asif 1          | Tester           | San Francisco |
#    Given the following datatable and convert to map
#      | name            | position         | office        |
#      | Tiger Nixon     | System Architect | Edinburgh     |
#      | Garrett Winters | Accountant       | Tokyo         |
#      | Asif 1          | Tester           | San Francisco |
    Given the following datatable and convert to pojo with DataTableTypeAnnotation
      | name            | position         | office        |
      | Tiger Nixon     | System Architect | Edinburgh     |
      | Garrett Winters | Accountant       | Tokyo         |
      | Asif 1          | Tester           | San Francisco |
