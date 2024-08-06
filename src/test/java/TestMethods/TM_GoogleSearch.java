package TestMethods;


import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.AddUser;
import Objects.Claim;
import Objects.GoogleSearch;
import Objects.JobTitle;
import Objects.LoginPage;
import Objects.SearchSystemUser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TM_GoogleSearch {
	
	protected static WebDriver driver;
	
	
	@BeforeTest
	public void beforeTest() {
		
		//ChromeOptions Options = new ChromeOptions();
		//Options.setHeadless(true);
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	@Test (priority =0)

	public void serachtext() throws InterruptedException {
		GoogleSearch page = new GoogleSearch(driver);
		//page.searchGoogle("Facebook");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		page.OrangeHRMpage("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
	}
	
	@Test (priority =1)
	public void VerifyLogin() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.UserN();
		lp.Password1();
		lp.Loginbutton();
		Thread.sleep(5000);
		lp.ClickAdmin();
		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(5000);
		
	}
	@Test  (priority =2)
	public void ADDUSER() throws InterruptedException, IOException {
		AddUser ax = new AddUser(driver);
		ax.adduser();
		Thread.sleep(3000);
		ax.role();
	}
	@ Test  (priority =3)
	public void SearchSystemUser1() throws InterruptedException {
		SearchSystemUser xs = new SearchSystemUser(driver);
		
		xs.SSU();
	}

	/*@Test  (priority =5)
	public void JobTitle1() throws InterruptedException {
		JobTitle JT = new JobTitle(driver);
		JT.job();
	}
	*/
	@Test (priority =4)
	public void ClaimProcess() throws InterruptedException {
		
		Claim x = new Claim(driver);
		x.ClaimProcess();
		
	}

//	@AfterTest
//	public void aftertest() {
//		driver.quit();
//		}
	
	

}
