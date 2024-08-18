package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
public class ScreenshotUtil {


    private static final String SCREENSHOTS_DIR = "screenshots/";

    // Ensure the directory exists
    public static void ensureScreenshotsDirectoryExists() {
        File dir = new File(SCREENSHOTS_DIR);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Screenshots directory created: " + SCREENSHOTS_DIR);
            } else {
                System.err.println("Failed to create screenshots directory: " + SCREENSHOTS_DIR);
            }
        }
    }

    // Take a screenshot
    public static void takeScreenshot(WebDriver driver, String fileName) {
        ensureScreenshotsDirectoryExists();
        if (driver == null) {
            System.err.println("WebDriver instance is null.");
            return;
        }
        
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
            File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);
            File destination = new File(SCREENSHOTS_DIR + fileName);

            try {
                FileHandler.copy(screenshot, destination);
                System.out.println("Screenshot saved: " + destination.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Failed to save screenshot: " + e.getMessage());
            }
        } else {
            System.err.println("Driver does not support screenshots.");
        }
    }
}
