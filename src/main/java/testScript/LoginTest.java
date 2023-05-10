

package testScript;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTest {

    private WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setUp() throws Exception {
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.driver.get("https://www.advantageonlineshopping.com/#/");


    }

    @Test
    public void loginTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        Thread.sleep(10000);
        loginPage.clickLogin();
        loginPage.sendKeysData();
        loginPage.clickSignin();
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.close();
    }



}
