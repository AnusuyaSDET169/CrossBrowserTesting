package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
public class hooks {
	
	
	@Before

   
    public void setUp(Scenario scenario) {
       // ConfigReader.setProperty("browser", browser);
        DriverManager.initializeDriver();
    }

	// public void setUp()
//	{
//        ConfigReader configReader = new ConfigReader();
//        String browser = configReader.getBrowser();
//        DriverManager.initializeDriver(browser);
//    }

    @After
    public void tearDown(Scenario scenario) {
        DriverManager.quitDriver();
    }



	
	/*
	 WebDriver driver;

	    @Before
	    public void setUp() {
	        driver = DriverManager.getDriver(new ConfigReader().getProperty("browser"));
	    }

	    @After
	    public void tearDown() {
	        DriverManager.quitDriver();
	    }
*/}
