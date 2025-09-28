package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Com.Pom.LoginPage;
import PageObjects.AccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPages;
import TestBase.Base_Test;

public class Tc2_qafoxLogin extends Base_Test {
	
	
	@Test
	public void logged() throws IOException, InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		driver.get(p.getProperty("appURL"));
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.getAcc_click().click();
		hp.getLogin_click().click();
		
		LoginPages lpg = new LoginPages(driver);
		Thread.sleep(2000);
		lpg.getEmail().sendKeys(p.getProperty("email"));
		lpg.getPasswr().sendKeys(p.getProperty("password"));
		lpg.getClickbutton().click();
		Thread.sleep(2000);
		AccountPage ap = new AccountPage(driver);
		ap.account_display();
		//driver.close();
		
 }
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
		
		
		
		
		}
    
    	
    
	
	
	
	
	


