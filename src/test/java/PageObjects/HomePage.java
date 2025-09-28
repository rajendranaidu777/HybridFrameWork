package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Base_Class;
import TestBase.Base_Test;

public class HomePage  {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement acc_click;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath="(//ul[@class='dropdown-menu dropdown-menu-right']//a)[2]")
	private WebElement login_click;
	
	
	public WebElement getLogin_click() {
		return login_click;
	}
	public WebElement getAcc_click() {
		return acc_click;
	}
	public WebElement getRegister() {
		return register;
	}
	
	
	
	

}
