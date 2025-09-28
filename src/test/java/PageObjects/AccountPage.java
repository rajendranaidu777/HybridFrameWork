package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Base_Class;

public class AccountPage {
	WebDriver driver;
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='content']//h2[1]")
	public   static WebElement acc_diplay;
		


    public  void account_display() {
    	
    	boolean disp=acc_diplay.isDisplayed();
    	System.out.println(disp);
    	
    }
    }
  


