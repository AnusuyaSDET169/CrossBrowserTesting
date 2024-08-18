package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.hooks;
import io.cucumber.java.en.And;
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

public class LoginSteps {
    ConfigReader configReader = new ConfigReader();
	QueuePage queuePage;
    HomePage homePage;
    WebDriver driver;
    LoginPage loginPage;	  
    StackPage stackPage;
    WebDriverWait wait;
    

    public LoginSteps() {
        driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        stackPage = new StackPage(driver);
        loginPage= PageFactory.initElements(driver, LoginPage.class);

    }
	
//	    public List<String[]> excelData;
//	    public String currentUsername;
//	    public String currentPassword;

 


   // WebDriver driver = DriverManager.getDriver();

//       
//    @Given("User is on Login Page and data from excel file {string}")
//    public void user_is_on_login_page_and_data_from_excel_file(String filePath) {
//     driver.get(ConfigReader.getProperty("baseUrl") + "/login");
//
//    	excelData = ExcelReader.getExcelData(filePath);
//
//    }
//    
    
	    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        driver.get(configReader.getProperty("baseUrl") + "/login");
        //driver.get(configReader.getProperty());

    }

	    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	    public void user_enters_username_and_password(String username, String password) {
	        loginPage.enterUsername(configReader.getProperty("username"));
            loginPage.enterPassword(configReader.getProperty("password"));
            
	    }

	    
//	    @When("User enters username and password from extract data")
//	    public void user_enters_username_and_password_from_extract_data() {
//	    	
//	    	for (String[] row : excelData) {
//	    		currentUsername = row[0];
//	            currentPassword = row[1];
//                   	    
//	            // Perform the login using currentUsername and currentPassword
//	            // Example: loginPage.login(currentUsername, currentPassword);
//	        }
//	    	loginPage.enterUsername(currentUsername);
//    	    loginPage.enterPassword(currentPassword); 
//    	    System.out.println(driver.getTitle());
//	    }
	    
	    
	    @And("User clicks on Login button")
	    public void user_clicks_on_login_button() {
	        loginPage.clickLoginButton();
	        System.out.println("Logged in Succesfully");
	        System.out.println(driver.getTitle());
	        
	    }

	    @Then("User is navigated to the home page")
	    public void user_is_navigated_to_home_page() {
	     driver.get(configReader.getProperty("baseUrl") + "/home");
	       // driver.get(configReader.getProperty1());
 
	      
	    }
	}


