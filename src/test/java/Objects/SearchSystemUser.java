package Objects;
import Objects.AddUser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bind.annotation.Super;

public class SearchSystemUser {
	WebDriver driver;

	public SearchSystemUser(WebDriver driver) {
		this.driver = driver;
			}
	
	By Username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[position()=1]");
	By EmpName  =  By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input");
	By sugg = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div/span");
	By Search = By.xpath("//button[@type='submit']");
	By userfound = By.xpath("//div[@class='oxd-table-cell oxd-padding-cell'][2]");
	
	public void SSU() throws InterruptedException {
		Thread.sleep(8000);
		
		driver.findElement(Username).sendKeys(AddUser.s1);
		WebElement dp_down = driver.findElement(dropdown);
		dp_down.click();
		Thread.sleep(3000);
		dp_down.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		driver.findElement(EmpName).sendKeys(AddUser.x);
		Thread.sleep(5000);
		driver.findElement(sugg).click();
		driver.findElement(Search).click();
		Thread.sleep(5000);
		WebElement user = driver.findElement(userfound);
		String xs =user.getText();
		
		if(xs.equals(AddUser.s1)) {
			System.out.println("User found Succesfully " +xs);
		}
		else {
			System.out.println("User not found" +xs);
		}
		
		
	}
}
