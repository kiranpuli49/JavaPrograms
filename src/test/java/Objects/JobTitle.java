package Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import TestMethods.TM_GoogleSearch;


public class JobTitle extends TM_GoogleSearch{
WebDriver driver;
	
	public JobTitle(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		Thread.sleep(4000);
			}
	
	By jobs= By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]");
	By jobtitle= By.className("oxd-topbar-body-nav-tab-link");
	By checkboxJob= By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]");
	By edit =By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[2]");
	By Upload = By.xpath("//input[@class='oxd-file-input']");
	By Save = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	
	public void job() throws InterruptedException {
		
		 driver.findElement(jobs).click();
		 driver.findElement(jobtitle).click();
		 Thread.sleep(4000);
		 driver.findElement(checkboxJob).click();
		 driver.findElement(edit).click();
		 Thread.sleep(4000);
		
		 WebElement up=driver.findElement(Upload);
		 up.sendKeys("C:\\Users\\kipuli\\Documents\\11.png");
		 
		 driver.findElement(Save).click();
		 System.out.println("User Saved");
		
		 	 
		 
	}
	
	
	 

}
