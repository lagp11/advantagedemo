package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

    public WebDriver driver	;


    public Base (WebDriver driver) {
        this.driver = driver;

    }

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", "/Users/lauragarciapinzon/Downloads/advantagedemo/src/test/java/test/resources/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }


}



