package TestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TollGE {
	protected static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get("https://www.cardekho.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void GetText() throws InterruptedException {
		driver.manage().deleteAllCookies();
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='NEW CARS ']"));
	    action.moveToElement(ele).perform();
	    driver.findElement(By.xpath("(//span[@class='innerSpan'])[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//li[text()='By Model']")).click();
	   driver.findElement(By.id("bmvBrand")).sendKeys("Hyundai");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//li[@data-value='Hyundai']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.id("bmvModel")).sendKeys("Aura");
	   driver.findElement(By.xpath("(//button[text()='Search'])[2]")).click();
	   Thread.sleep(5000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scoroll");
	}

}
