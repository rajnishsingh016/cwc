package com.qa.marketplace.cwc.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.marketplace.cwc.base.TestBase;
import com.qa.marketplace.cwc.pages.AdminLogin;
import com.qa.marketplace.cwc.pages.ContactUS;
import com.qa.marketplace.cwc.pages.HomePage;

public class ContactRequest extends TestBase{
	AdminLogin loginpage;
	HomePage homepage;
	public ContactRequest() {
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		Initilization();
		loginpage= new AdminLogin();
		homepage=loginpage.AdminLogin(prop.getProperty("AdminUserName"), prop.getProperty("AdminPassword"));
		
	}
	



}
