package com.qa.marketplace.cwc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.marketplace.cwc.base.TestBase;

public class SellerGroup extends TestBase{
	
	
	
	
	
	
	
	
	
	
	//Registration Type Indivisual or Business
	@FindBy(name="regType")
	WebElement RegistrationType;
	
	//User Type Investor, Broker or Vendor
	@FindBy(name="userType")
	WebElement userType;
	
	//User First Name
	@FindBy(name="firstName")
	WebElement firstName;
	
	//User Last Name
	@FindBy(name="lastName")
	WebElement lastName;
		
	//User Company Name
	@FindBy(name="companyName")
	WebElement companyName;
		
	//User Title
	@FindBy(name="title")
	WebElement title;
		
	//User email
	@FindBy(name="email")
	WebElement email;
		
	//User Website	
	@FindBy(name="website")
	WebElement website;
		
	//User Mobile No
	@FindBy(name="cellNumber")
	WebElement mobileNo;

	//Office Number
	@FindBy(name="officeNumber")
	WebElement officeNo;

	//Office Extention Number
	@FindBy(name="officeNumberExt")
	WebElement officeExt;
	
	//Address One
	@FindBy(name="addressOne")
	WebElement address1;
	
	//Address Two
	@FindBy(name="addressTwo")
	WebElement address2;
	
	//Zip Code
	@FindBy(name="pinCode")
	WebElement pinCode;
	
	//City
	@FindBy(name="city")
	WebElement city;
	
	//State
	@FindBy(name="stateCode")
	WebElement state;
	
	//Country
	@FindBy(name="countryCode")
	WebElement countryCode;
	
	//License State	
	@FindBy(name="licenseStateCode[]")
	WebElement LicenseState;
	
	//License Number
	@FindBy(name="licenseNumber[]")
	WebElement License;
	
	//Property Type Specialties
	@FindBy(name="propertyTypeSpecialties[]")
	WebElement propertyTypeSpecialties;
	
	
	
	//Region Served
	@FindBy(name="geographicAreaServed[]")
	WebElement geographicAreaServed;
	
	//Notes
	@FindBy(name="notes")
	WebElement notes;
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void AddBroker() {
		
		
		
		
		
		
	}

}
