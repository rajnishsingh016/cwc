package com.qa.marketplace.cwc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.marketplace.cwc.base.TestBase;

public class AdminLogin extends TestBase {
	
	
	@FindBy(name = "email")  //Admin User Name
	WebElement AdminUserName;
	
	@FindBy(name="password")	//Admin Password
	WebElement AdminPassword;
	
	@FindBy(name="submit")		//Admin Submit button
	WebElement AdminLoginButton;
	
	@FindBy(xpath="//*[@id='admin_login']/div/div/div[2]/div[6]/a")
	WebElement AdminForgetPassword;
	
	
	public AdminLogin() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public HomePage AdminLogin(String un, String pwd){
		AdminUserName.sendKeys(un);
		AdminPassword.sendKeys(pwd);
		AdminLoginButton.click();
		return new HomePage();
		}

	
}
