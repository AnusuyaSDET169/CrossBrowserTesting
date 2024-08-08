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
    By tryhere= By.xpath("//a[@class='btn btn-info']");
  //  By textEditor=By.xpath("//div[@class='CodeMirror cm-s-default']");
    By RunButton= By.xpath("//button[@type='button']");

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
    
    public void tryhere(String code) {
    	 WebElement element = driver.findElement(By.xpath("//a[@class='btn btn-info']"));
    	 element.click();
    	 String script = "var editor = document.querySelector('.CodeMirror').CodeMirror;" +
                 "editor.setValue(arguments[0]);";
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript(script,code);
         
        // driver.findElement(textEditor).sendKeys(tryeditortest);
         
         WebElement element1=driver.findElement(By.xpath("//button[@type='button']"));
          element1.click();
		}

	
    }

