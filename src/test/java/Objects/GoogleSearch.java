package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleSearch {

	WebDriver driver;
	
	public GoogleSearch(WebDriver driver) {
		this.driver= driver;
		
	}
	
	 By Searchbox = By.xpath("//textarea[@id='APjFqb']");
	 
	
	public void searchGoogle(String text) {
		driver.findElement(Searchbox).sendKeys(text);
		
	}
	
	
	public void OrangeHRMpage(String URL) {
		driver.get(URL);
		
	}
	 
	 
	 
	 
	
}
