package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.googlesearchpage;
import Pages.googlesearchpagePOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearchtestPOM {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	
	
	public static void googlesearch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ABC");
//		googlesearchpage.textbox_search(driver).sendKeys("ABC");
		
		googlesearchpagePOM searchpageobj = new googlesearchpagePOM(driver);
		searchpageobj.setTextInSearchbox("A B C");
		searchpageobj.clickSearchButton();
		
		driver.close();
		driver.quit();
		System.out.println("Run Successfully");
}
	

}
