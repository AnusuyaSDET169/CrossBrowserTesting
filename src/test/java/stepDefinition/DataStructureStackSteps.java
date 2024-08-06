package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.QueuePage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.DriverManager;

public class DataStructureStackSteps {
	
	QueuePage queuePage;
    HomePage homePage;
    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    LoginPage loginPage;	  
    StackPage stackPage;
    WebDriverWait wait;
		    
   public DataStructureStackSteps() {
	   
     driver = DriverManager.getDriver(configReader.getProperty("browser"));
      homePage = new HomePage(driver);
	  stackPage =new StackPage(driver);
   }
	@When("User scrolls to Implementation of Stack")
	public void user_scrolls_to_implementation_of_stack() {
        homePage.selectDataStructures();
        homePage.selectStack();
		
	}
	@When("User clicks on Implementation of Stack")
	public void user_clicks_on_implementation_of_stack() {	
		stackPage.verifyStackPage();
       // WebElement element = driver.findElement(By.linkText("Implementation"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        //element.click();
	}
	@Then("User is navigated to the Implementation of Stack page")
	public void user_is_navigated_to_the_implementation_of_stack_page() {
	  System.out.println("stackpage");
	}
	
	
}
	
	/*WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    LoginPage loginPage;
    HomePage homePage;
    StackPage stackPage;

    public DataStructureStackSteps() {
        driver = DriverManager.getDriver(configReader.getProperty("browser"));
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        stackPage = new StackPage(driver);
    }

    @Given("I open the login page")
    public void iOpenTheLoginPage() {
        driver.get(configReader.getProperty("baseUrl") + "/login");
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        loginPage.enterUsername(configReader.getProperty("username"));
        loginPage.enterPassword(configReader.getProperty("password"));
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        //assertTrue(homePage.driver.findElement(By.id("logoutButton")).isDisplayed());
        Assert.assertTrue(loginPage.driver.findElement(By.xpath("//a[text()='Sign out']")).isDisplayed());

    }

    @When("I select Data Structures and Algorithms")
    public void iSelectDataStructuresAndAlgorithms() {
        homePage.selectDataStructures();
    }

    @When("I select Stack from the list")
    public void iSelectStackFromTheList() {
        homePage.selectStack();
    }

    @Then("I should see the stack page")
    public void iShouldSeeTheStackPage() {
        stackPage.verifyStackPage();
    }

    @When("I log out")
    public void iLogOut() {
        homePage.clickLogoutButton();
    }

    @Then("I should be logged out successfully")
    public void iShouldBeLoggedOutSuccessfully() throws InterruptedException {
       // assertTrue(loginPage.driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed());
      //  Assert.assertTrue(homePage.driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed());
    	
    	System.out.println("Loggedout Success");

    }


}*/
