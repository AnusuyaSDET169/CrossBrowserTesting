package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class QueuePage {

	WebDriver driver;

    By queueTitle = By.xpath("//h4[text()='Queue']");
    By ImplementationofQueue  = By.linkText("Implementation of Queue in Python");

    public QueuePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyQueuePage() {

    	Assert.assertTrue(driver.findElement(queueTitle).isDisplayed());
    	System.out.println(driver.getTitle());
    	WebElement element = driver.findElement(ImplementationofQueue);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
         element.click();
        //driver.findElement(ImplementationofQueue).click();    	

}
}


