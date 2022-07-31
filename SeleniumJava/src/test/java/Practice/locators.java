package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		
//Browser driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//Get url
		driver.get("https://www.google.com");
		
//Finding element and storing in a variable which of type webelement
		
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("ABC");
		
	//	WebElement searchbox = driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
// Find Elements
		List<WebElement> listofinputelements = driver.findElements(By.xpath("//input"));
		
// For count
		int count =  listofinputelements.size();
		System.out.println("Number of list : "+count);
		

	}
	

}

