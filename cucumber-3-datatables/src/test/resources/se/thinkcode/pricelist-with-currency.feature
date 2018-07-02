Feature: Cucumber can convert a Gherkin table to to a map.

  This an example of a more complicated price list.

  Scenario: An international coffee shop must handle currencies
    Given the price list for an international coffee shop
      | product | currency | price |
      | coffee  | EUR      | 1     |
      | donut   | SEK      | 18    |
    When I buy 1 coffee
    And I buy 1 donut
    Then should I pay 1 EUR and 18 SEK