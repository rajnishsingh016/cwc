package com.qa.marketplace.cwc.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.marketplace.cwc.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath=".//*[@id='lastestUsersData']/tr[1]/td")
	List<WebElement> UserTableCols;
	
	@FindBy(xpath=".//*[@id='lastestUsersData']/tr")
	List<WebElement> UserTableRows;
	
	@FindBy(xpath=".//*[@id='lastestPorpeties']/tr[1]/td")
	List<WebElement> PropertyTableCols;
	
	@FindBy(xpath=".//*[@id='lastestPorpeties']/tr")
	List<WebElement> totalPropertyRows;
	
	@FindBy(xpath=".//*[@id='lastestPorpeties']/tr")
	List<WebElement> ContactLink;
	
	
	
	
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);	}
	
	
	public void UserTable() {
		System.out.println("Latest User are: ");
		List<WebElement> col = UserTableCols;  
		System.out.println("No of cols are : " +col.size()); 
		List<WebElement> row = UserTableRows;  
		System.out.println("No of rows are "+row.size());

	for(int i=1;i<=row.size();i++) {
		
	for (int j=1;j<=col.size();j++) {
	
		String CellText= driver.findElement(By.xpath("//*[@id='lastestUsersData']/tr["+i+"]/td["+j+"]")).getText();
		
		System.out.println("Row "+j+" column "+i+" Text Value is =  "+CellText);
		
					}
	System.out.println("");
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
		}
		}

	public void LatestProperties(){
		System.out.println("Latest Properties are: ");
		List<WebElement> col = PropertyTableCols;  
		System.out.println("No of cols are : " +col.size()); 
		List<WebElement> row = totalPropertyRows;  
		System.out.println("No of rows are "+row.size());
		
		for(int i=1;i<=row.size();i++) {
			
			for (int j=1;j<=col.size();j++) {
				String CellText= driver.findElement(By.xpath("//*[@id='lastestPorpeties']/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Row "+j+" column "+i+" Text Value is =  "+CellText);
					}
			System.out.println("");
			System.out.println("+++++++++++++++++++++++++++++++++++++++");
			}
		
	
	
	

	
	
	
	}


	







}
