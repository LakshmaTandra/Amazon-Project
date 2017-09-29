package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverContext.Driver,this);
        DriverContext.Wait= new WebDriverWait(DriverContext.Driver ,10);
    }
}
