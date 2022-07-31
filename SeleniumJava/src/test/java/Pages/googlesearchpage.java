package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {
	private static WebElement element = null;
	
// here we will have all the locator. and we need to create function for all objects
	
	
	public static WebElement textbox_search(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='q']"));
		return element;	
	}

	public static WebElement searchbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='btnK']"));
		return element;
		
	}
}

// Notes
// All the webelements will be listing in pages and actions will be on actions
// this is objectclass
// no void beacuse here we are returning the type
// variables are container to store data