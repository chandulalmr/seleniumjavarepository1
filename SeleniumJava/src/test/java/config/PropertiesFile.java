package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.testng_properties;

public class PropertiesFile {
	// First we need to create an object of class properties class
				static Properties prop = new Properties();

				//For getting location use 	System.getProperty		
			static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		getproperties();
		setproperties();
		getproperties();

	}
	public static void getproperties() {

		try {

			// second we need to create an object of class Input stream
			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);

		} catch (Exception e) {
			System.out.println("I am inside catch block");
			System.out.println("Message is: " +e.getMessage());
			System.out.println("Cause is: " +e.getCause());
			e.printStackTrace();
		}		
	
	}
	
	public static void setproperties() {
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("Browser", "Chrome");
			prop.store(output, null);
			
		} catch (Exception e) {
			System.out.println("I am inside catch block");
			System.out.println("Message is: " +e.getMessage());
			System.out.println("Cause is: " +e.getCause());
			e.printStackTrace();
		}
		}

}
