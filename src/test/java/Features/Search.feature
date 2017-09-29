Feature: Search for a product and Add to cart

  Scenario: Search for book and add a product to basket from search results.
    Given I am on homepage
    When I search for a product "book"
    And I am on search results page "book"
    When I click on product from search results
    Then I navigate to Product page
    And i click on Add to cart button
    Then verify product is added to cart

