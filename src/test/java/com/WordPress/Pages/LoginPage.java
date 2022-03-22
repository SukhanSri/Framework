package com.WordPress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver d) {
		this.driver = d;
	}
	@FindBy(id="email") WebElement emailid;
	@FindBy(how=How.ID,using="pw-input") WebElement passwrd;
	@FindBy(how= How.ID,using="sign-in") WebElement signin_Button;
	@FindBy(how=How.ID,using="forgot-password") WebElement forgot_Password;
	
	public void login_wordpress(String emlid, String pass)
	{
		emailid.sendKeys(emlid);
		passwrd.sendKeys(pass);
		signin_Button.click();
	}
}
