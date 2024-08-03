package utilities;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	
		private static WebDriver driver;

	    public static  WebDriver getDriver(String browser) {
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
	}
	
