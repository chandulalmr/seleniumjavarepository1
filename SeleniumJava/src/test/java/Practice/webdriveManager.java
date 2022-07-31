package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriveManager {

	public static void main(String[] args) {
		
// No need of this when a webdrivermanager is used		
//		String projectPath = System.getProperty("user.dir");				
//		 System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/Chrome/chromedriver.exe");
			
		
//For getting version we can use 	
//		WebDriverManager.chromedriver().browserVersion("2.36").setup();
		// Without verion
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		/*
		 * driver.findElement(By.className("q")).sendKeys("ABC");
		 * driver.findElement(By.name("btnK")); driver.close(); driver.quit();
		 */
		System.out.println("Success");
	
	}

}
