$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search for a product and Add to cart",
  "description": "",
  "id": "search-for-a-product-and-add-to-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22028271969,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search for book and add a product to basket from search results.",
  "description": "",
  "id": "search-for-a-product-and-add-to-cart;search-for-book-and-add-a-product-to-basket-from-search-results.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for a product \"book\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am on search results page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on product from search results",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigate to Product page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "i click on Add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductSearch.iAmOnHomepage()"
});
formatter.result({
  "duration": 9521425529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "book",
      "offset": 24
    }
  ],
  "location": "ProductSearch.iSearchForAProduct(String)"
});
formatter.result({
  "duration": 2489343426,
  "status": "passed"
});
formatter.match({
  "location": "ProductSearch.iAmOnSearchResultsPage()"
});
formatter.result({
  "duration": 4212029250,
  "status": "passed"
});
formatter.match({
  "location": "ProductSearch.iClickOnAnyProductFromSearchResults()"
});
formatter.result({
  "duration": 3377493265,
  "status": "passed"
});
formatter.match({
  "location": "ProductSearch.iNavigateToProductPage()"
});
formatter.result({
  "duration": 5266352790,
  "status": "passed"
});
formatter.match({
  "location": "ProductSearch.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 468189352,
  "status": "passed"
});
formatter.match({
  "location": "ProductSearch.verifyProductIsAddedToCart()"
});
formatter.result({
  "duration": 2776017960,
  "status": "passed"
});
formatter.after({
  "duration": 136498,
  "status": "passed"
});
});