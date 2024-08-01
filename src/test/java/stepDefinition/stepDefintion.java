package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefintion {

	public WebDriver driver;
	
	@Given("I open the {string} browser")
	public void i_open_the_browser(String browser) {
		System.out.println(" start diff browsers");
	 
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
		
	
	@When("I navigate to {string}")
	public void i_navigate_to(String string) {
		System.out.println("browsers");
        driver.get("https://example.com");
	}
	@Then("the page title should be {string}")
	public void the_page_title_should_be(String string) {
		System.out.println("browsers ended");
		driver.getTitle();

	}

	
}
