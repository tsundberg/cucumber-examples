Feature: Cucumber can convert a Gherkin data table to a list of a type you specify.

  Scenario: The sum of a list of numbers should be calculated
    Given a list of numbers
      | 17   |
      | 42   |
      | 4711 |
    When I summarize them
    Then should I get 4770
