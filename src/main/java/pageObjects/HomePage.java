package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By skyWhiteButton = By.xpath("//*[@id=\"extra\"]/button[2]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSkyWhiteButton() {
        driver.findElement(skyWhiteButton).click();
    }

}
