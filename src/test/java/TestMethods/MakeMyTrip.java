package TestMethods;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
	protected static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-extensions");
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void m2() throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		SearchContext shadow = driver.findElement(By.cssSelector("epaas-consent-drawer-shell")).getShadowRoot();
		Thread.sleep(5000);
         
	//	driver.findElement(By.xpath("//a[@class='close']")).click();
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='webklipper-publisher-widget-container-notification-container']")));
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@class='close']")).click();
		
//		
		
		Actions actions = new Actions(driver);		
		actions.moveByOffset(100, 100).click().perform();
		
	}


}
