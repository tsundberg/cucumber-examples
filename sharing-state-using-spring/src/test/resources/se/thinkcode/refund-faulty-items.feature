Feature: Refund faulty items

  Broken items should be refunded if you have receipt

  Scenario: Returning a broken kettle to the store
    Given that Joanna bought a faulty kettle for $100
    When she return the kettle to the store
    Then she will get $100 refunded