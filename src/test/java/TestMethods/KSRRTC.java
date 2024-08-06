package TestMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KSRRTC {
	
	
	
	protected static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void M1() throws InterruptedException {
		String title = driver.getCurrentUrl();// to get the current url of webpage
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Mitra")).click();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		WebDriverWait sd= new WebDriverWait(driver, Duration.ofSeconds(8));
		WebElement e=driver.findElement(By.xpath("//div[@class='pagelink']//child::a"));
		sd.until(ExpectedConditions.visibilityOf(e));
		e.click();
	}

}
