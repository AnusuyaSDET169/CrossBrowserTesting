package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	

	
	private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }

}
	/*
	private Properties properties;
    private final String propertyFilePath = "src/test/resources/config.properties";

    public ConfigReader() {
        properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(propertyFilePath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }
    public String getProperty() {
    	
    	//getProperty("baseUrl") + "/login");
        return properties.getProperty(("baseUrl") + "/login");

    }
    
 public String getProperty1() {
    	
    	//getProperty("baseUrl") + "/login");
        return properties.getProperty(("baseUrl") + "/home");

    }
    // Add more methods to fetch other properties as needed
}
	*/

/*
	 private static Properties properties = new Properties();

	    static {
	        try {
	            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
	            properties.load(fileInputStream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {
	        return properties.getProperty(key);
	    }
	}

	    */