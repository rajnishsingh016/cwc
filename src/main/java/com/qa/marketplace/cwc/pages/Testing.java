package com.qa.marketplace.cwc.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.marketplace.cwc.base.TestBase;
import com.qa.marketplace.cwc.util.TestUtil;

public class Testing extends TestBase{
	static WebDriver driver;
	public static void main(String args[]) throws Exception{
		
		System.out.println("Chrome Browser Lanuching........");
		System.setProperty("webdriver.chrome.driver", "//home//rajnish//Desktop//Selenium//browser//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		System.out.println("browser lanuched Successfully");
		
		driver.get("https://dev.realinsight.com/admin/");
		driver.findElement(By.name("email")).sendKeys("lovepreets@clavax.us");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		List<WebElement> col = driver.findElements(By.xpath(".//*[@id='lastestUsersData']/tr[1]/td"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.xpath(".//*[@id='lastestUsersData']/tr"));
		System.out.println(row.size());
		
		for(int i=1;i<=row.size();i++) {
			for(int j=1;j<=col.size();j++) {
			String text=driver.findElement(By.xpath("//*[@id='lastestUsersData']/tr["+i+"]/td["+j+"]")).getText();
			System.out.println(text);
		}
			
		System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}
}
