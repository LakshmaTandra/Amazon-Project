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

public class SearchResultsPage extends BasePage {

    public SearchResultsPage() {

    }

    @FindBy(how = How.XPATH ,using = "//*[@id='result_0']/div/div[2]/div/div[1]")
    public WebElement listedProduct;

    @FindBy(how = How.ID,using = "quartsPagelet")
    public  WebElement resultsText;





    public void clickOnProduct(){
        DriverContext.Wait.until(ExpectedConditions.visibilityOf(listedProduct));
        listedProduct.click();
    }

    public void VerifySearchResults( String product){

        DriverContext.Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("quartsPagelet")));
        String searchText = resultsText.getText();
        try{
            Assert.assertTrue(searchText.contains(product));
        } catch (Exception e){
            System.out.println(" Search result failed");
        }

    }

}
