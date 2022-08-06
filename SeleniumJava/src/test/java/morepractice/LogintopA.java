package morepractice;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintopA {
	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp(){
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();

	}

	public LogintopA(WebDriver driver) {
		this.driver = driver;

	}

	@Test
	public static void loginPA(){
		//	  try {
		driver.get("https://practiceadmin.securehealthform.net/login");
		driver.findElement(By.name("email")).sendKeys("dcarees@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.get("https://practiceadmin.securehealthform.net/dashboard");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
}