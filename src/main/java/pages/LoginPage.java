
package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.Base;

public class LoginPage extends Base {


    public String titleLoginPage = "Log in | Advantagedemo";

    By buttonLogin = By.id("menuUser");
    By textBoxUsername = By.name("username");
    By textBoxPassword = By.name("password");
    By buttonSignin = By.id("sign_in_btnundefined");

    By buttonLoginSucess = By.id("menuUserLink");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysData (){
        driver.findElement(textBoxUsername).sendKeys(("Holi123"));
        driver.findElement(textBoxPassword).sendKeys(("123456789Ab"));

    }

    public void clickLogin() {
        driver.findElement(buttonLogin).click();
    }

    public void clickSignin() {
        driver.findElement(buttonSignin).click();
    }


    }



















