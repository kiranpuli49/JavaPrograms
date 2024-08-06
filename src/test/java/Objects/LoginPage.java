package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	By Username = By.name("username");
	By Password = By.xpath("//input[@name='password']");
	By LoginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	By Admin = By.linkText("Admin");
	public void UserN() {
		
		driver.findElement(Username).sendKeys("Admin");
	
	}
	
	public void Password1() {
		driver.findElement(Password).sendKeys("admin123");
	}
	
	public void Loginbutton() {
		driver.findElement(LoginButton).click();
		String title = driver.getTitle();
		assertEquals(title, "OrangeHRM");
		
	}
	public void ClickAdmin() {
		driver.findElement(Admin).click();
		    
	}

}
