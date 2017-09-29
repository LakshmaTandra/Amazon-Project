package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{

    public HomePage() {

    }

    @FindBy(how = How.ID,using = "twotabsearchtextbox")
    public WebElement txtSearch;



    @FindBy(how = How.XPATH,using = "//*[@value='Go']")
    public WebElement btnSearch;




    public void searchForProduct(String product){

        txtSearch.sendKeys(product);
        btnSearch.submit();

    }
}
