package steps;

import base.BaseUtil;
import base.DriverContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hook  {


    @Before
    public void initialisingBrowser(){
        System.out.println("Opening browser");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\lakshma\\Desktop\\AmazonProject\\geckodriver\\geckodriver.exe");
        DriverContext.Driver =new FirefoxDriver();
        DriverContext.Driver.manage().window().maximize();
        DriverContext.Wait= new WebDriverWait(DriverContext.Driver , 10);


    }


    @After
    public void closingBrowser(){
        System.out.println("Closing Browser");
        DriverContext.Driver.quit();

    }
}
