package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SkyBackgroundSteps {

    WebDriver driver;

    @Given("Set SkyBlue Background button exists")
    public void set_SkyBlue_Background_button_exists() {
        // Setting up the driver
        System.setProperty("webdriver.chrome.driver", "/Users/rajan/Desktop/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://techfios.com/test/101/");
    }

    @When("I click on the button")
    public void i_click_on_the_button() {
        driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
    }

    @Then("the background color will change to sky blue")
    public void the_background_color_will_change_to_sky_blue() {
        String color = driver.findElement(By.tagName("body")).getCssValue("background-color");
        assertEquals("[rgba(135, 206, 235, 1)]", color);
        driver.quit();
    }
}
