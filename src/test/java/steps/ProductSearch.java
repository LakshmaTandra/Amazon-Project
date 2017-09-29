package steps;

import base.BaseUtil;
import base.DriverContext;
import cucumber.api.PendingException;
import pages.HomePage;
import pages.ProductDescriptionPage;
import pages.SearchResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductSearch {



    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws Throwable {
        System.out.println("I am on homepage");
        DriverContext.Driver.get("https://www.amazon.co.uk/");
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String product) throws Throwable {
        System.out.println("I search for a product "+ product);
        HomePage homepage= new HomePage();
        homepage.searchForProduct(product);
    }

    @And("^I am on search results page \"([^\"]*)\"$")
    public void iAmOnSearchResultsPage(String product) throws Throwable {
        System.out.println("I am on search results page");
        SearchResultsPage searchresultspage = new SearchResultsPage();
        searchresultspage.VerifySearchResults(product);

    }

    @When("^I click on product from search results$")
    public void iClickOnAnyProductFromSearchResults() throws Throwable {
        System.out.println("I click on  product from search results ");
        SearchResultsPage searchresultpage = new SearchResultsPage();
        searchresultpage.clickOnProduct();

    }

    @Then("^I navigate to Product page$")
    public void iNavigateToProductPage() throws Throwable {
        System.out.println("I navigate to product page");
        ProductDescriptionPage productdesciptionpage = new ProductDescriptionPage();
        productdesciptionpage.verifyProductDescriptionPage();

    }



    @And("^i click on Add to cart button$")
    public void iClickOnAddToCartButton() throws Throwable {
        System.out.println("I click on add to cart button");
        ProductDescriptionPage productdescriptionpage = new ProductDescriptionPage();
        productdescriptionpage.clickAddToCart();

    }

    @Then("^verify product is added to cart$")
    public void verifyProductIsAddedToCart() throws Throwable {
        System.out.println("Verify product is added to cart");
        ProductDescriptionPage productdescriptionpage = new ProductDescriptionPage();
        productdescriptionpage.verifyProductAddedToBasket();
  }



}
