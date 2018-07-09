package com.qa.marketplace.cwc.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.marketplace.cwc.base.TestBase;

public class ContactUS extends TestBase{
	
	
	@FindBy(xpath="//*[@id='propertyListing']/div[2]/div[3]/table/thead/tr/th[3]/span")
	List<WebElement> ContactCols;
	
	@FindBy(xpath="//*[@id='propertyListing']/div[2]/div[3]/table/tbody/tr[5]/td[3]")
	List<WebElement> ContactRows;
	
	public ContactUS() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void inquiries() throws Exception{
			System.out.println("Contact Inquiries");
			List<WebElement> col = ContactCols;  
			System.out.println("No of cols are : " +col.size()); 
			List<WebElement> row = ContactRows;  
			System.out.println("No of rows are "+row.size());
		
	}
	

}
