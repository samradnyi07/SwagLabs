package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.login("standard_user", "secret_sauce");
		
	}
	
	@Test
	public void invalidLoginTest() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.login("sam", "sam");
		String errorMsg = loginPage.getErrorMessage();
		Assert.assertEquals(errorMsg,"Epic sadface: Username and password do not match any user in this service");
	}
	@Test
	public void validateUsernameEditable() {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isUsernameEditable());
	}
	
	@Test
	public void validatePasswordEditable() {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.isPasswordEditable());
	}
}
