package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class LoginPage {
	
	WebDriver driver;
	ElementUtils eleUtils;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		eleUtils = new ElementUtils(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	@FindBy(css = "h3[data-test='error']")
	WebElement errorMessage;

	public void enterUserName(String username) {
		eleUtils.type(userName, username);
	}
	
	public void enterPassword(String password) {
		eleUtils.type(this.password, password);
	}
	
	public void login(String username,String password) {
		eleUtils.type(userName, username);
		eleUtils.type(this.password, password);
		eleUtils.click(loginButton);
		
	}
	public String getErrorMessage() {
		return  eleUtils.getText(errorMessage);
	}
	public boolean isUsernameEditable() {
		return userName.isEnabled();
	}
	public boolean isPasswordEditable() {
		return password.isEnabled();
	}
}
