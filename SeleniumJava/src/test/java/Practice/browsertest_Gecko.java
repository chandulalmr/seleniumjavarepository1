package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsertest_Gecko {

	public static void main(String[] args) {
		
// Store the project path		
		String projectPath = System.getProperty("user.dir");
		
//Geckdriver assign				
		System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/Gecko/geckodriver.exe");
		//System.out.println("projectpath");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.className("q")).sendKeys("ABC");
		driver.findElement(By.name("btnK"));
		driver.close();
		driver.quit();
		System.out.println("Success");
	
	}

}
