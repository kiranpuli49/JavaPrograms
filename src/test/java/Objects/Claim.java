package Objects;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestMethods.TM_GoogleSearch;

public class Claim extends TM_GoogleSearch{
	
	
WebDriver driver;
	
	public  Claim(WebDriver driver) {
		this.driver = driver;
			}
	
	By claimBu = By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]");
	By addClaim= By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By EmpName= By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input");
	By eventDp = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	By currency =By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	By remark= By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
	By submit = By.xpath("//button[@type='submit']");
	By typeEvent= By.xpath("(//div[@class='oxd-select-option'])[4]");
	By currencytype= By.xpath("(//div[@class='oxd-select-option'])[63]");
	By Sug = By.xpath("//div[@class='oxd-autocomplete-option']");
	public void ClaimProcess() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(claimBu).click();
		Thread.sleep(3000);
		driver.findElement(addClaim).click();
		Thread.sleep(3000);
		System.out.println(AddUser.x);
		driver.findElement(EmpName).sendKeys("Ravi");
		Thread.sleep(4000);
		 List<WebElement> optionsToSelect = driver.findElements(Sug);

		    for(WebElement option : optionsToSelect){
		        System.out.println(option);
		        if(option.getText().equals("Ravi M B")) {
		           // System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
		
//		driver.findElement(sugBy).click();
		//System.out.println(AddUser.x);
		driver.findElement(eventDp).click();
		driver.findElement(typeEvent).click();
		driver.findElement(currency).click();
		driver.findElement(currencytype).click();
		driver.findElement(remark).sendKeys("Flight Charges");
		driver.findElement(submit).click();				
		
	}
	

}
