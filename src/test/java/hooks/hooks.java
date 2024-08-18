package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ScreenshotUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
public class hooks {
    public static WebDriver driver;

    
    //Hooks code for Screenshot capture
//	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//	    @Before
//	    public void setUp() {
//	        WebDriverManager.chromedriver().setup();
//	        WebDriver webDriver = new ChromeDriver();
//	        webDriver.manage().window().maximize();
//	        driver.set(webDriver);
//	    }
//
//	    @After
//	    public void tearDown(Scenario scenario) {
//	        WebDriver webDriver = driver.get();
//
//	        if (webDriver == null) {
//	            System.err.println("WebDriver is null in tearDown.");
//	            return;
//	        }
//
//	        if (scenario.isFailed()) {
//	            ScreenshotUtil.takeScreenshot(webDriver, scenario.getName() + ".png");
//	        }
//
//	        webDriver.quit();
//	        driver.remove(); // Clean up after test
//	    }
//
//	    public static WebDriver getDriver() {
//	        return driver.get();
//	    }
//	}
    
	
	@Before

    public void setUp(Scenario scenario) {
       // ConfigReader.setProperty("browser", browser);
        DriverManager.initializeDriver();
    }


    @After
    public void tearDown(Scenario scenario) {
    
        DriverManager.quitDriver();


    }
    public static WebDriver getDriver() {
        return driver;
    }
}	 



	