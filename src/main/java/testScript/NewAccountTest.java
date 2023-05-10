package testScript;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.NewAccountPage;

public class NewAccountTest {

    private WebDriver driver;

    NewAccountPage NewAccountPage;

    @BeforeTest
    public void setUp() throws Exception {
        NewAccountPage = new NewAccountPage(driver);
        driver = NewAccountPage.chromeDriverConnection();
        NewAccountPage.driver.get("https://www.advantageonlineshopping.com/#/");

    }

        @Test
        public void NewAccountTest () throws InterruptedException {
            NewAccountPage = new NewAccountPage(driver);
            Thread.sleep(10000);
            NewAccountPage.clickLogin();
            Thread.sleep(10000);
            NewAccountPage.clickNewAccount();
            NewAccountPage.RegisterTest();
            NewAccountPage.assertValidation();

        }
    @AfterTest
    public void tearDown() throws Exception {
        driver.close();
    }

}



