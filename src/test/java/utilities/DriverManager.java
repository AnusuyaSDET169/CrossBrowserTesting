package utilities;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {


	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initializeDriver() {
        String browser = ConfigReader.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        }
        driver.get().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }
    
    public static void quitDriver() {
        WebDriver driverInstance = driver.get();

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }

	
	/*
	
		private static WebDriver driver;

	    public static  WebDriver getDriver(String browser) {
	    	
	       // String browser = ConfigReader.getProperty("browser");
	        if (driver == null) {
	            switch (browser.toLowerCase()) {
	                case "firefox":
	                    WebDriverManager.firefoxdriver().setup();
	                    driver = new FirefoxDriver();
	                    break;
	                case "chrome":
	                default:
	                    WebDriverManager.chromedriver().setup();
	                    driver = new ChromeDriver();
	                    break;
	            }
	        }
	     // Set page load timeout and maximize window
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	        driver.manage().window().maximize();
	        
	        return driver;
	    }
	
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
*/
		
	}
	
