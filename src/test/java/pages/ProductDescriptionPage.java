package pages;

import base.BasePage;
import base.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDescriptionPage extends BasePage {


    public ProductDescriptionPage() {

    }

    @FindBy(how = How.ID,using = "add-to-cart-button")
    public WebElement btnAddToCart;


    @FindBy(how = How.ID ,using = "huc-v2-order-row-messages")
    public WebElement msgAddedToBasket;

//        base.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='huc-v2-order-row-confirm-text']/h1")));
//        Assert.assertEquals("Added to Basket", base.driver.findElement(By.xpath("//*[@id='huc-v2-order-row-confirm-text']/h1")).getText());



    public void verifyProductDescriptionPage(){

        DriverContext.Wait.until(ExpectedConditions.visibilityOf(btnAddToCart));

        try {
            Assert.assertTrue(btnAddToCart.isDisplayed());
        }catch (Exception e){
            System.out.println("Add to cart button not visible on product description page");
        }
    }


    public void clickAddToCart(){

        btnAddToCart.click();
    }


    public void verifyProductAddedToBasket(){

        DriverContext.Wait.until(ExpectedConditions.visibilityOf(msgAddedToBasket));
        try {
            Assert.assertTrue(msgAddedToBasket.getText().equalsIgnoreCase("Added to Basket"));
        }catch (Exception e){
            System.out.println("Product not added to basket");
        }

    }

}
