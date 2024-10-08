package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.QueuePage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelReader;

public class DataStructureStackSteps {
    private List<String[]> excelData;
    private String tryeditor;
	QueuePage queuePage;
    HomePage homePage;
    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    LoginPage loginPage;	  
    StackPage stackPage;
    WebDriverWait wait;
		    
   public DataStructureStackSteps() {
	   
     driver = DriverManager.getDriver();
      homePage = new HomePage(driver);
	  stackPage =new StackPage(driver);
	  loginPage=new LoginPage(driver);

	  
	  
	  //this.driver = hooks.getDriver();
   }
   
	@When("User scrolls to Implementation of Stack")
	public void user_scrolls_to_implementation_of_stack() {
		homePage.selectDataStructures();
        homePage.selectStack();

		
	}
	@When("User clicks on Implementation of Stack")
	public void user_clicks_on_implementation_of_stack() {	
		stackPage.verifyStackPage();
		

	}
	@Then("User is navigated to the Implementation of Stack page")
	public void user_is_navigated_to_the_implementation_of_stack_page() {
		stackPage.tryhere("print\"hello\"");
//		for (String[] row : excelData) {
//    		tryeditor = row[0];
//    
//        }
		//stackPage.tryhere(tryeditor);

	    String Executed=driver.findElement(By.xpath("//pre[@id='output']")).getText();
	    System.out.println(Executed);
		
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
