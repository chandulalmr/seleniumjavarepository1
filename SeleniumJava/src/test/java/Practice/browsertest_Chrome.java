package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsertest_Chrome {

	public static void main(String[] args) {
		
// Store the project path		
		String projectPath = System.getProperty("user.dir");
		
//Chromedriver assign				
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/Chrome/chromedriver.exe");
		//System.out.println("projectpath");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		/*
		 * driver.findElement(By.className("q")).sendKeys("ABC");
		 * driver.findElement(By.name("btnK")); driver.close(); driver.quit();
		 */
		System.out.println("Success");
	
	}

}
