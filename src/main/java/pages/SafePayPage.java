package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SafePayPage extends Base {

    public String titlePurchaseUser = "Purchase | Advantagedemo";

    By buttonTablets = By.id("tabletsTxt");
    By buttonArticle = By.cssSelector("#\\31 7");
    By buttonAddcard = By.xpath("//div[4]/button");
    By buttonPopup = By.id("checkOutPopUp");
    By buttonRegistration = By.id("registration_btnundefined");
    By buttonNextpay = By.id("next_btn");
    By textBoxSafepayName = By.name("safepay_username");
    By textBoxSafepayPass = By.name("safepay_password");
    By buttonSafepay = By.id("pay_now_btn_SAFEPAY");



    public SafePayPage(WebDriver driver) {
        super(driver);
    }

    public void ShoppingCart (){

        driver.findElement(buttonTablets).click();
        driver.findElement(buttonArticle).click();
        driver.findElement(buttonAddcard).click();
        driver.findElement(buttonPopup).click();
        driver.findElement(buttonRegistration).click();

    }

    public void Safepay (){

        driver.findElement(buttonNextpay).click();
        driver.findElement(textBoxSafepayName).sendKeys("hola205030");
        driver.findElement(textBoxSafepayPass).sendKeys("hola205030");
        driver.findElement(buttonSafepay).click();

    }





}
