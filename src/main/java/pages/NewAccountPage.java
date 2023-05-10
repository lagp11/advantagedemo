
package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewAccountPage extends Base {


    public String titleRegisterPage = "Register | Advantagedemo";

    By buttonLoginU = By.id("menuUser");
    By buttonNewaccount = By.linkText("CREATE NEW ACCOUNT");
    By textBoxnameR = By.name("usernameRegisterPage");
    By textBoxemail = By.name("emailRegisterPage");
    By textBoxPasswordR = By.name("passwordRegisterPage");
    By textBoxPasswordC = By.name("confirm_passwordRegisterPage");
    By checkAgree = By.name("i_agree");

    By buttonRegister = By.xpath("//div[2]/sec-sender/button");


    public NewAccountPage(WebDriver driver) {
        super(driver);
    }



    public void RegisterTest (){


        driver.findElement(textBoxnameR).sendKeys(("Holi123"));
        driver.findElement(textBoxemail).sendKeys(("holi123@gmail.com"));
        driver.findElement(textBoxPasswordR).sendKeys(("123456789Ab"));
        driver.findElement(textBoxPasswordC).sendKeys(("123456789Ab"));
        driver.findElement(checkAgree).click();
       driver.findElement(buttonRegister).click();


    }

    public void clickLogin() {
        driver.findElement(buttonLoginU).click();
    }
    public void clickNewAccount() {
        driver.findElement(buttonNewaccount).click(); }

        public void assertValidation () {
            String title = driver.getTitle();
            String ExpectedTitle = " Advantage Shopping";
            Assert.assertEquals(title, ExpectedTitle);
            System.out.println("test ok");

        }


    }















