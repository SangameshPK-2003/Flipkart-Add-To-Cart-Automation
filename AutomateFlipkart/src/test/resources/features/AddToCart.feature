Feature: Flipkart Add to Cart

  Scenario: Add Samsung product to cart
    Given I open Flipkart
    When I search for "samsung s24"
    And I add the first product to cart
    Then the product should be added successfully
