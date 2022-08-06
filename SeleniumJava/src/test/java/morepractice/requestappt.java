package morepractice;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class requestappt {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private JavascriptExecutor js;

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("https://appointments.mconsent.net/pa?dcarene");
		driver.findElement(By.xpath("//form[@id='regForm']/div[2]/div/div[2]/div[2]/label")).click();
		driver.findElement(By.id("nextBtn")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[3]/div/div[2]/div[3]/label")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[3]/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//section[@id='calendar-grid']/time[9]")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[5]/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//div[@id='morning-section']/div/span/a/div")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[6]/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[7]/div/div[2]/div/div/label")).click();
		driver.findElement(By.id("patient-fname")).click();
		driver.findElement(By.id("patient-fname")).clear();
		driver.findElement(By.id("patient-fname")).sendKeys("Juan");
		driver.findElement(By.id("patient-lname")).click();
		driver.findElement(By.id("patient-lname")).clear();
		driver.findElement(By.id("patient-lname")).sendKeys("Mary");
		driver.findElement(By.id("patient-gender")).click();
		new Select(driver.findElement(By.id("patient-gender"))).selectByVisibleText("Female");
		driver.findElement(By.id("patient-contact")).click();
		driver.findElement(By.id("patient-email")).click();
		driver.findElement(By.id("patient-email")).clear();
		driver.findElement(By.id("patient-email")).sendKeys("chandulal@srs.com");
		driver.findElement(By.id("pcm")).click();
		new Select(driver.findElement(By.id("pcm"))).selectByVisibleText("Text");
		driver.findElement(By.id("Payment_Method")).click();
		new Select(driver.findElement(By.id("Payment_Method"))).selectByVisibleText("Pay Myself");
		driver.findElement(By.xpath("//form[@id='regForm']/div[7]/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[9]/div[2]/div/button[2]")).click();
		driver.findElement(By.id("userOtp")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[10]/div/div[4]/label")).click();
		driver.findElement(By.xpath("//form[@id='regForm']/div[10]/div[2]/div/button[2]")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
