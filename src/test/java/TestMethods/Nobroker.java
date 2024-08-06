package TestMethods;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nobroker extends Base {
	
	By login = By.cssSelector(".px-1p.border-l-1.border-l-solid.border-l-header-grey.cursor-pointer");
	 
	By mobile = By.id("signUp-phoneNumber");
 
	By pass = By.id("login-signup-form-login-radio-password");
 
	By enter_password = By.xpath("//input[@id='login-signup-form__password-input']");
 
	By conti = By.id("signUpSubmit");
 
	By profile = By
			.xpath("//span[@class='whitespace-nowrap truncate overflow-hidden max-w-10p text-header-text-color']");
 
	By menu = By.id("main-menu");
 
	By property = By.xpath("//a[text()='Post Your Property']");
 
	By sell_text = By.cssSelector(".heading-3.text-center.font-semi-bold.nb__1KYeb");
	By toggle = By.xpath("//label[@class='nb-switch']");
 
	By newpost = By.id("postNow");
 
	By city = By.cssSelector(".css-1hwfws3.nb-select__value-container");
 
	By your_city = By.xpath("//div[normalize-space()='Chennai']");
 
	By frame_element = By.xpath("//iframe[@id='webWidget']");
	
	//****************************
	
	By frame1=By.cssSelector("#webWidget");
	
	
	//***************************
 
	By chatbox = By.xpath("//h1[text()='NoBroker Support']");
 
	By minimize = By.xpath("//button[@aria-label='Minimize widget']");
 
	By ad_Property = By.xpath("//div[@class='nb__1AqTi' and text()='Flatmates']");
 
	By start = By.cssSelector(".btn.btn-primary.btn-lg.btn-block");
	By text = By.xpath("//div[@class='Do you have a property that you want to post on NoBroker.com ?']");
	By click_yes = By.xpath("//div[@class='nb__3WPQy']/button[contains(text(),'Yes')]");
	By fr=By.xpath("//div[@class='nb__1DADI']");
	
	protected static WebDriver driver;
	@BeforeTest
	public void beforeTest() {
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-extensions");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		
	}
	
	// Login
	@Test(priority=0)
		public void login() throws InterruptedException {
			// click on login
			WebElement log = driver.findElement(login);
			clickMethod(log);
	 
			// Enter mobile number
			Thread.sleep(3000);
			WebElement phone = driver.findElement(mobile);
			sendKeys(phone,"8074172979");
	 
			// select i have password
			implicitWait(driver, Duration.ofSeconds(10));
			WebElement click_passwo = driver.findElement(pass);
			clickMethod(click_passwo);
	 
			// enter password
			implicitWait(driver, Duration.ofSeconds(10));
			WebElement password_enter = driver.findElement(enter_password);
			sendKeys(password_enter, "moun4523");
	 
			// click on continue
			Thread.sleep(4000);
			implicitWait(driver, Duration.ofSeconds(10));
			WebElement contin = driver.findElement(conti);
			clickMethod(contin);
	 
			implicitWait(driver, Duration.ofSeconds(10));
//			takeScreenshot(driver, "Signin");
	 
		}
	 
		// validating the profile of user
	@Test(priority=1)
		public void validate_profile() {
	 
			String actual_text = driver.findElement(profile).getText();
			String expected_text = "Mounika";
			System.out.println(actual_text);
	 
			Assert.assertEquals(actual_text, expected_text);
			if (actual_text.equals(expected_text)) {
				System.out.println("Validation Passed!" + actual_text);
			} else {
				System.out.println("Actual text not equals with expected text");
			}
		}
	 
		// Navigate to menu and click on post your property
	@Test(priority=2)
		public void navigate_menu() throws InterruptedException {
	         Thread.sleep(3000);
			// click on menu
			WebElement menu_click = driver.findElement(menu);
			clickMethod(menu_click);
	 
			// select post your property
			Thread.sleep(3000);
			WebElement property_post = driver.findElement(property);
			clickMethod(property_post);
	 
			String text = driver.getTitle();
			System.out.println(text);
	 
			WebElement rent_text = driver.findElement(sell_text);
//			getText(rent_text);
			Thread.sleep(7000);
			WebElement active = driver.findElement(toggle);
			clickMethod(active);
			Thread.sleep(9000);
			driver.switchTo().frame(driver.findElement(frame1));
	        WebElement mini = driver.findElement(minimize);
			clickMethod(mini);
			driver.switchTo().defaultContent();
	 
			System.out.println("minimize the tab");
//			scrollVertically(driver, 500);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			WebElement new_post = driver.findElement(newpost);
			clickMethod(new_post);
	 
		}
	 
		// click select city and one(Chennai) city is selected
	@Test(priority=3)
		public void post() throws InterruptedException {
	 
			// click on select city
		
		     Thread.sleep(4000);
			implicitWait(driver, Duration.ofSeconds(10));
			WebElement select_city = driver.findElement(city);
			clickMethod(select_city);
	 
			// select city
			Thread.sleep(4000);
			WebElement city = driver.findElement(your_city);
			clickMethod(city);
	 
		}
	 
		// close the chat box
//	@Test(priority=4)
//		public void chat_box() throws InterruptedException {
//	        try{
//			// Wait and switch to frame
//	        driver.switchTo().frame(driver.findElement(frame1));
//	        WebElement mini = driver.findElement(minimize);
//			clickMethod(mini);
//			driver.switchTo().defaultContent();
//	 
//			System.out.println("minimize the tab");
//	        }
//	        catch(NoSuchElementException e) {
//	        	System.out.println(e.getMessage());
//	        }
//	        
//		}	
			
		
	 
		// select property ad type and click on start posting for free
	@Test(priority=4)
		public void post_ad() {
	 
			// click on flatmates
			WebElement residential = driver.findElement(ad_Property);
			clickMethod(residential);
	 
			// click on start posting for free
			WebElement posting = driver.findElement(start);
			clickMethod(posting);
			implicitWait(driver, Duration.ofSeconds(30));
	 
			// click on yes
			/*WebElement post = driver.findElement(text);
			Actions act = new Actions(driver);
			act.moveToElement(post).perform();// move to element
			System.out.println("Mouse hover");*/
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("	//div[@class='nb__3WPQy']/button[contains(text(),'Yes')]")));
			
			WebElement yes = driver.findElement(click_yes);
			clickMethod(yes);
			System.out.println("done bro");
		}
			

}
