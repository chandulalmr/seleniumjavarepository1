package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {
	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("ABC");
		textbox.sendKeys(Keys.RETURN);
		
		
//		WebElement searchbox = driver.findElement(By.xpath("//input[@name='btnK']"));
//		searchbox.sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Run Successfully");
}
	

}
