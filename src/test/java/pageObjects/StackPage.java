package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class StackPage {
	WebDriver driver;

    By stackTitle = By.xpath("//h4[text()='Stack']");

    public StackPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyStackPage() {
        assertTrue(driver.findElement(stackTitle).isDisplayed());
    }
}
