package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googlesearchpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchtest {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	
	
	public static void googlesearch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABC");
		googlesearchpage.textbox_search(driver).sendKeys("ABC");
		
		
//		textbox.sendKeys(Keys.RETURN);
//		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		googlesearchpage.searchbox(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Run Successfully");
}
	

}
