package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.DriverManager;

import org.openqa.selenium.WebDriver;
public class hooks {

	
	 WebDriver driver;

	    @Before
	    public void setUp() {
	        driver = DriverManager.getDriver(new ConfigReader().getProperty("browser"));
	    }

	    @After
	    public void tearDown() {
	        DriverManager.quitDriver();
	    }
}
