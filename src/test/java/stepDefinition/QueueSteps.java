package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.QueuePage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.DriverManager;

public class QueueSteps {

	
	
	QueuePage queuePage;
    HomePage homePage;
    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    LoginPage loginPage;	  
    StackPage stackPage;
    WebDriverWait wait;

    public QueueSteps() {
      
    	driver = DriverManager.getDriver();

    	//driver = DriverManager.getDriver(configReader.getProperty("browser"));
        homePage = new HomePage(driver);
        queuePage =new QueuePage(driver);
    }
    
    
    @When("User scrolls to Implementation of Queue")
    public void user_scrolls_to_implementation_of_queue() {
        homePage.selectDataStructures();
    	homePage.selectQueue();

    }
    @When("User clicks on Implementation of Queue")
    public void user_clicks_on_implementation_of_queue() {
    	queuePage.verifyQueuePage(); 
		
    }
    @Then("User is navigated to the Implementation of Queue page")
    public void user_is_navigated_to_the_implementation_of_queue_page() {
    	
    }

    
    
    
    
    
    
    /*
    @When("I select queue from the list")
    public void i_select_queue_from_the_list() {
    	homePage.selectQueue();
    }
    
    @Then("I should see the queue page")
    public void i_should_see_the_queue_page() {
		queuePage.verifyQueuePage(); 
//		WebElement element = driver.findElement(ImplementationofQueue);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        element.click();
        
        
        WebElement element1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText("Implementation of Queue in Python")));
		element1.click();

    }
*/
	}


