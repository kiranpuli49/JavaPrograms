package JavaacriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollupANDscrolldown {
	
	protected static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
//		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/"); 
		driver.manage().window().maximize();
		
	}
	@Test
	public  void scorll() throws InterruptedException {
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//To scroll down
		j.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		//To scroll up
		j.executeScript("window.scrollBy(0,-900)");
		}
	@Test
	public void movetoEle() throws InterruptedException {
		 JavascriptExecutor j=(JavascriptExecutor) driver;
		// assign up to which path we want to down
		WebElement w = driver.findElement(By.xpath("(//a[text()='documentation'])[1]"));
		//scroll down up to particular path
		j.executeScript("arguments[0].scrollIntoView(true)",w); Thread.sleep(5000);
//		driver.findElement(By.xpath("(//a[text()='documentation'])[1]")).click();
	}
	
}
