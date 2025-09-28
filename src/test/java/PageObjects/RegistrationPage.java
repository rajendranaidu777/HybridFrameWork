package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Base.Base_Class;

public class RegistrationPage extends Base_Class {
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telenumber;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")
    private WebElement repassword;
	@FindBy(xpath="//label[normalize-space()='Yes']")
	private WebElement subscribe;
	@FindBy(xpath="//input[@name='agree']")
	private WebElement privacy;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement submitted;
	public WebElement getTelenumber() {
		return telenumber;
	}
	public WebElement getRepassword() {
		return repassword;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubscribe() {
		return subscribe;
	}
	public WebElement getPrivacy() {
		return privacy;
	}
	public WebElement getSubmitted() {
		return submitted;
	}
	
	public static String randomalpha() {
		String gen_alpha=RandomStringUtils.randomAlphabetic(6);
		return gen_alpha;
	}
	
	public static String random_num() {
		String gen_num=RandomStringUtils.randomNumeric(10);
		return gen_num;
	}
	
	public static String random_passcode() {
		String gen_alpha=RandomStringUtils.randomAlphabetic(3);
	    String gen_num=RandomStringUtils.randomNumeric(3);
	    return(gen_alpha+"@^"+gen_num);
	}

}
