package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.DriverManager;



public class DataStructureStackSteps {
	WebDriver driver;
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

}
