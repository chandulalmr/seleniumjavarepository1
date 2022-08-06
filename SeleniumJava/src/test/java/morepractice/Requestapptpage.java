package morepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Requestapptpage {
	private WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}


	@Test
	public void testUntitledTestCase(){
		LogintopA trytologin = new LogintopA(driver);
		LogintopA.loginPA();
	
		driver.findElement(By.linkText("Appointments")).click();
		driver.findElement(By.xpath("//img[contains(@src,'https://practiceadmin.securehealthform.net/assets/images/svg/request_icon.svg')]")).click();
		driver.findElement(By.xpath("//div[@id='main-content']/div/div/div/div/div[2]/div[3]/div/a/span")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.get("https://practiceadmin.securehealthform.net/login");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown(){
		driver.close();
		driver.quit();
}
}