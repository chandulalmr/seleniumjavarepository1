package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpagePOM {
	private static WebDriver driver = null;

// with two statements we found locators
	By textbox_search = By.xpath("//input[@name='q']");
	By searchbox = By.xpath("//input[@name='btnK']");

// We will be using driver instance from the test case. so we need add constructor
	
	public googlesearchpagePOM(WebDriver driver) {
		this.driver = driver;
		
	}
	
// We need to add methods for actions on these objects	

	public void setTextInSearchbox(String text){
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(searchbox).sendKeys(Keys.RETURN);
	}

}

// Notes
// All Webelements / object locators and actions will be included in pages.
// Create class for webpage