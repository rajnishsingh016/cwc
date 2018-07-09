package com.qa.marketplace.cwc.base;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.qa.marketplace.cwc.util.TestUtil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/rajnish/Desktop/Selenium/workplace1/cwc/src/main/java/com/qa/marketplace/cwc/config/config.properties");
			prop.load(ip);
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
					}
		catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void Initilization() {
	String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.out.println("Chrome Browser Lanuching........");
			System.setProperty("webdriver.chrome.driver", "//home//rajnish//Desktop//Selenium//browser//chromedriver");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			System.out.println("Firefox Browser Lanuching........");
			System.setProperty("webdriver.gecko.driver","/home/rajnish/Desktop/Selenium/browser/geckodriver.exe" );
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		System.out.println("browser lanuched Successfully");
		driver.get(prop.getProperty("AdminURL"));
		
		
		
		
		
	}


	







}
