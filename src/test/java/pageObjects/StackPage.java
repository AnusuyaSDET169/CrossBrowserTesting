package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class StackPage {
	WebDriver driver;

    By stackTitle = By.xpath("//h4[text()='Stack']");
    By Implementationofstack  = By.linkText("Implementation");

    public StackPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyStackPage() {

    	Assert.assertTrue(driver.findElement(stackTitle).isDisplayed());
    	System.out.println(driver.getTitle());
    	  WebElement element = driver.findElement(By.linkText("Implementation"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
         element.click();
    }
}
