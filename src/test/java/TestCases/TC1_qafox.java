package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Base.Base_Class;
import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import TestBase.Base_Test;

public class TC1_qafox extends Base_Class {
	@BeforeClass
	public void launchbrowser() {
		//Base_Test test = new Base_Test();
		
		browserLaunch("Chrome");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@AfterClass
	public void teardown() {
	//	terminating();
	}
	@Test
	public void testcase() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		WebElement acc_click = hp.getAcc_click();
		acc_click.click();
		hp.getRegister().click();
		
		//reg page
		
		RegistrationPage rp = new RegistrationPage();
		
		
		passvalues(rp.getFirstname(),rp.randomalpha());
		passvalues(rp.getLastname(), rp.randomalpha());
		passvalues(rp.getEmail(), rp.randomalpha()+"@gmail.com");
		passvalues(rp.getTelenumber(),rp.random_num());
		
		String password=rp.random_passcode();
		passvalues(rp.getPassword(), password);
		passvalues(rp.getRepassword(), password);
		clicking(rp.getSubscribe());
		clicking(rp.getPrivacy());
		clicking(rp.getSubmitted());
		//logout
		WebElement acc_click1 = hp.getAcc_click();
		acc_click1.click();
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		
		
		
	}
	
	

}
