package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.googlesearchpagePOM;
import config.PropertiesFile2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_properties {
	static WebDriver driver = null;
	public static String browserName = null;

@BeforeTest
	public static void Setup() {
	
// link to propert file	
	PropertiesFile2.getproperties();
	
	if (browserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	else if (browserName.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

		
	}

@Test
	public static void Test() {
		driver.get("https://www.google.com");
		googlesearchpagePOM searchpageobj = new googlesearchpagePOM(driver);
		searchpageobj.setTextInSearchbox("A B C");
		searchpageobj.clickSearchButton();	
		
	}

@AfterTest
	public static void teardorn() {
		
		driver.close();
//		driver.quit();
		System.out.println("Run Successfully");
		PropertiesFile2.setproperties();
}
	
}
