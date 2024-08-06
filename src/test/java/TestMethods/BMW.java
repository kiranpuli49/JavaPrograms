package TestMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BMW {
	protected static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void m2() throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SearchContext shadow = driver.findElement(By.cssSelector("epaas-consent-drawer-shell")).getShadowRoot();
		
		shadow.findElement(By.cssSelector(".accept-button.button-primary")).click();
		
	}

}
