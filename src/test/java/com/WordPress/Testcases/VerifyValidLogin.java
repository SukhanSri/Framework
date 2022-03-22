package com.WordPress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.WordPress.Pages.LoginPage;
import com.WordPress.Utility.BrowserFactory;

public class VerifyValidLogin {
	WebDriver driver;
	
	
	
	
	@Test
	public void checkValidUser() {
	driver =	BrowserFactory.startBrowser("firefox", "https://www.macys.com/account/signin?lid=glbtopnav_sign_in-us");
	LoginPage login_page =PageFactory.initElements(driver, LoginPage.class);	
	
	login_page.login_wordpress("sukhansri1@gmail.com", "Apex2022*");
	}

}
