package com.qa.marketplace.cwc.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.marketplace.cwc.base.TestBase;
import com.qa.marketplace.cwc.pages.AdminLogin;
import com.qa.marketplace.cwc.pages.ContactUS;
import com.qa.marketplace.cwc.pages.HomePage;

public class LoginTest extends TestBase {
	AdminLogin loginpage;
	HomePage homepage;
	
	public LoginTest() {
		super();
		}
		
	@BeforeMethod
	public void setUp() {
		Initilization();
		loginpage= new AdminLogin();
		
	}
	@Test(priority=1)
	public void LoginAdmin() throws Exception {
		homepage =	loginpage.AdminLogin(prop.getProperty("AdminUserName"), prop.getProperty("AdminPassword"));
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		homepage.UserTable();
		homepage.LatestProperties();
		
	}
	
	
}
