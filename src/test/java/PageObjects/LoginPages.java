package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Base_Class;

public class LoginPages {
	WebDriver driver;
	public LoginPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwr;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement clickbutton;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPasswr() {
		return passwr;
	}
	public WebElement getClickbutton() {
		return clickbutton;
	}

}
