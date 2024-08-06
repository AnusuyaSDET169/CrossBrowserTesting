package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class StackPage {
	WebDriver driver;

    By stackTitle = By.xpath("//h5[text()='Stack']");
    
  
    public StackPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyStackPage() {

    	Assert.assertTrue(driver.findElement(stackTitle).isDisplayed());
    }
}
