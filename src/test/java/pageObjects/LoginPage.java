package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	public WebDriver driver;

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@value='Login']");
    

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String currentUsername) {
        driver.findElement(usernameField).sendKeys(currentUsername);
    }

    public void enterPassword(String currentPassword) {
        driver.findElement(passwordField).sendKeys(currentPassword);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    
    
    //// new code
    
    
    
    
    
}
