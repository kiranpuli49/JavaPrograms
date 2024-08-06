package Objects;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import TestMethods.TM_GoogleSearch;


public class AddUser extends TM_GoogleSearch{
	
	
WebDriver driver;
	
	public AddUser(WebDriver driver) {
		this.driver = driver;
			}
	
	By AddUser1 = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By dropdown = By.xpath("(//div[@class='oxd-select-text-input'])[position()=1]");
	By EmpName  =  By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input");
	By sugg = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div/span");
    By Status   =  By.xpath("(//div[@class='oxd-select-text-input'])[2]");
    By Username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By Password = By.xpath("(//input[@type='password'])[1]");
    By CPassword = By.xpath("(//input[@type='password'])[2]");
    By save =      By.xpath("//button[@type='submit']");
    By name =     By.xpath("//p[@class='oxd-userdropdown-name']");
    static String s1 = RandomStringUtils.randomAlphabetic(8);
    static String x;

	public void adduser() throws InterruptedException {
		driver.findElement(AddUser1).click();
		Thread.sleep(5000);

	}
	public void role() throws InterruptedException, IOException {
		
		WebElement dp_down = driver.findElement(dropdown);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
//		driver.findElement(EmpName).sendKeys("kiruthika  D N");
		
//		List <WebElement> options = driver.findElements(dropdown);
//		for(WebElement names : options) {
//			String name = names.getText();
//			System.out.println(name);
//		}
		
//		//System.out.println(options.size());
//		Select x = new Select(dp_down);
//		x.selectByVisibleText("Admin");;
		
		dp_down.click();
		Thread.sleep(3000);
		x=driver.findElement(name).getText();
		System.out.println(x);
		dp_down.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		driver.findElement(EmpName).sendKeys(x);
		Thread.sleep(5000);
		driver.findElement(sugg).click();
		WebElement status =driver.findElement(Status);
		status.click();
		Thread.sleep(3000);
		status.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		//String s1 = RandomStringUtils.randomAlphabetic(8); 
		driver.findElement(Username).sendKeys(s1);
		driver.findElement(Password).sendKeys("Kiran123");
		driver.findElement(CPassword).sendKeys("Kiran123");
		TakesScreenshot ts =(TakesScreenshot) driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File trg= new File("C:\\Users\\kipuli\\eclipse-workspace\\Test\\ScreenShots\\AddUser1.png");
		 FileUtils.copyFile(src, trg);
		 WebElement LeftNav=driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']"));
		File src1= LeftNav.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C:\\\\Users\\\\kipuli\\\\eclipse-workspace\\\\Test\\\\ScreenShots\\\\LeftNav.png");
		FileUtils.copyFile(src1, trg1);
		 
		driver.findElement(save).click();
		
		/*Actions act = new Actions(driver);
		 act.keyDown(Keys.ENTER).keyUp(Keys.ENTER);
		*/ 
	/*	String mes = driver.findElement(By.xpath("((//div[contains(@class,'oxd-toast-container')])[last()]//p)[1]")).getText();
		if(mes.contains("Saved")){
			System.out.println("User Saved");
			Reporter.log("Saved",true);
		}
		else {
			System.out.println("User not Saved");
		}
		Thread.sleep(7000);
		
		*/
		//wait.until(ExpectedConditions.elementToBeSelected(dp_down));
		
		
//		
		

	
	}

}