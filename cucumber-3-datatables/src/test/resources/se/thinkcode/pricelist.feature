Feature: Cucumber can convert a Gherkin table to to a map.

  This an example of a price list.

  Scenario: A price list can be represented as price per item
    Given the price list for a coffee shop
      | coffee | 1 |
      | donut  | 2 |
    When I order 1 coffee
    And I order 1 donut
    Then should I pay 3