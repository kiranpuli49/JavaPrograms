package TestMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	
	// Generic class for Click Method
		public void clickMethod(WebElement element) {
			element.click();
			
		}
		
		// Generic method for sendkeys
		public void sendKeys(WebElement element, String text) {
			element.sendKeys(text);
		}
		
		//Generic method for getting text
		public void getText(WebElement element,String text) {
			 text = element.getText();
			 System.out.println(text);
			
		}
		//Generic method for submit
		
		public void submit(WebElement element) {
			element.submit();
		}
		
		// generic method for implicit wait
	    public static void implicitWait(WebDriver driver,Duration timeoutInSeconds) {
			
			driver.manage().timeouts().implicitlyWait(timeoutInSeconds);
		}
		

}
