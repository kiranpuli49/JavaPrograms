package TestMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftwareTesting {
	
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
		Thread.sleep(9000);
//SearchContext shadow = driver.findElement(By.cssSelector("epaas-consent-drawer-shell")).getShadowRoot();
		
		driver.findElement(By.xpath("//div[@class='cb-close']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='mega-menu-link'])[2]")).click();
		
	}

}
