package morepractice;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class Formsubmission {
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
	public void testS() throws Exception {
		
		try {
			driver.get("https://securehealthform.net/caretapemr/webform_login.php?page=/webform/dcarene&formid=Nzk2");
			driver.findElement(By.id("new_fname")).click();
			driver.findElement(By.id("new_fname")).clear();
			driver.findElement(By.id("new_fname")).sendKeys("test");
			driver.findElement(By.id("new_lname")).click();
			driver.findElement(By.id("new_lname")).clear();
			driver.findElement(By.id("new_lname")).sendKeys("srs");
			driver.findElement(By.id("new_dob")).click();
			driver.findElement(By.id("new_dob")).clear();
			driver.findElement(By.id("new_dob")).sendKeys("12/14/1999");
			
			WebElement imageelement = driver.findElement(By.id("captcha_code"));
			Thread.sleep(2000);
			
			File src = imageelement.getScreenshotAs(OutputType.FILE);
			String path = "D:\\My Works\\LearnSelenium\\seleniumjavarepository1\\SeleniumJava\\Captcha.png";
			FileHandler.copy(src, new File(path));
			Thread.sleep(2000);
			ITesseract image = new Tesseract();
			String str =image.doOCR(new File(path));
			System.out.println("Image ocr done");
			System.out.println();
			
			
//			
//			driver.findElement(By.id("captcha_code")).click();
//			driver.findElement(By.id("captcha_code")).click();
//			driver.findElement(By.id("captcha_code")).clear();
//			driver.findElement(By.id("captcha_code")).sendKeys("86F33B");
//			driver.findElement(By.id("web_signup")).click();
//			driver.get("https://securehealthform.net/webform/dcarene&formid=Nzk2");
			
		} catch (Exception e) {

		}
//		driver.get("https://securehealthform.net/caretapemr/webform_login.php?page=/webform/dcarene&formid=Nzk2");
//		driver.findElement(By.id("new_fname")).click();
//		driver.findElement(By.id("new_fname")).clear();
//		driver.findElement(By.id("new_fname")).sendKeys("test");
//		driver.findElement(By.id("new_lname")).click();
//		driver.findElement(By.id("new_lname")).clear();
//		driver.findElement(By.id("new_lname")).sendKeys("srs");
//		driver.findElement(By.id("new_dob")).click();
//		driver.findElement(By.id("new_dob")).clear();
//		driver.findElement(By.id("new_dob")).sendKeys("12/14/1999");
//		driver.findElement(By.id("captcha_code")).click();
//		driver.findElement(By.id("captcha_code")).click();
//		driver.findElement(By.id("captcha_code")).clear();
//		driver.findElement(By.id("captcha_code")).sendKeys("86F33B");
//		driver.findElement(By.id("web_signup")).click();
//		driver.get("https://securehealthform.net/webform/dcarene&formid=Nzk2");
//		driver.close();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
//
//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//
//	private boolean isAlertPresent() {
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
//
//	private String closeAlertAndGetItsText() {
//		try {
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//			if (acceptNextAlert) {
//				alert.accept();
//			} else {
//				alert.dismiss();
//			}
//			return alertText;
//		} finally {
//			acceptNextAlert = true;
//		}
//	}
}
