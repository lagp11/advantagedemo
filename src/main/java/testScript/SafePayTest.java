package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import pages.SafePayPage;

import java.util.concurrent.TimeUnit;

public class SafePayTest {

    private WebDriver driver;

    SafePayPage SafePayPage;
    NewAccountPage NewAccountPage;

    @BeforeTest
    public void setUp() throws Exception {
        SafePayPage = new SafePayPage(driver);
        NewAccountPage = new NewAccountPage(driver);
        driver = SafePayPage.chromeDriverConnection();
        SafePayPage.driver.get("https://www.advantageonlineshopping.com/#/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    @Test
    public void NewAccountTest () throws InterruptedException {
        SafePayPage = new SafePayPage(driver);
        NewAccountPage = new NewAccountPage(driver);
        SafePayPage. ShoppingCart();
        NewAccountPage.RegisterTest();
        SafePayPage.Safepay();

    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.close();
    }






}
