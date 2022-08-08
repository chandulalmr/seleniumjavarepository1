package morepractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class srs {
	private static WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private JavascriptExecutor js;

	public static void main(String[] args)throws IOException, TesseractException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");

		driver.get("https://securehealthform.net/caretapemr/webform_login.php?page=/webform/dcarene&formid=Nzk2");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
		String path = System.getProperty("user.dir")+"/Captcha/captcha.png";

		FileHandler.copy(src, new File(path));
		Thread.sleep(2000);
		ITesseract image = new Tesseract();
		String str =image.doOCR(new File(path));
//		System.out.println("Image ocr done");
		System.out.println(str);
		driver.close();
		driver.quit();
	}


}