package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.googlesearchpagePOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	static WebDriver driver = null;

@BeforeTest
	public static void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

@org.testng.annotations.Test
	public static void Test() {
		driver.get("https://www.google.com");
		googlesearchpagePOM searchpageobj = new googlesearchpagePOM(driver);
		searchpageobj.setTextInSearchbox("A B C");
		searchpageobj.clickSearchButton();	
		
	}

@AfterTest
	public static void teardorn() {
		
		driver.close();
		driver.quit();
		System.out.println("Run Successfully");
}
	

}
