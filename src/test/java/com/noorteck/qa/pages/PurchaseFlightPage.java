package com.noorteck.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;



public class PurchaseFlightPage {

	
	
	@FindBy(xpath = "//input[@id='inputName']")
	WebElement inputNameField;

	@FindBy(id = "address")
	WebElement inputAddressField;

	@FindBy(id = "city")
	WebElement inputCityField;

	@FindBy(id = "state")
	WebElement inputStateField;

	@FindBy(id = "zipCode")
	WebElement inputZipCodeField;

	@FindBy(id = "cardType")
	WebElement CardTypeField;

	@FindBy(id = "creditCardNumber")
	WebElement ccNumberField;

	@FindBy(id = "creditCardMonth")
	WebElement CardMonthField;

	@FindBy(id = "creditCardYear")
	WebElement CardYearField;

	@FindBy(id = "nameOnCard")
	WebElement NameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement RemmberMeCheckboxField;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement PurchaseBtnField;

	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement ConfirmationTextField;

	// Class Constructor
	public PurchaseFlightPage() {

		PageFactory.initElements(Constants.driver, this);

	}
	
	
	public void enterName(String name) {

		inputNameField.sendKeys(name);

	}

	public void enterAddress(String address) {

		inputAddressField.sendKeys(address);

	}

	public void City(String city) {

		inputCityField.sendKeys(city);
	}

	public void State(String state) {

		inputStateField.sendKeys(state);
	}

	public void ZipCode(String zipcode) {

		inputZipCodeField.sendKeys(zipcode);
	}

	public void CardType(String cardType) {

		Select select = new Select(CardTypeField);

		select.selectByVisibleText(cardType);
	}

	public void CardNumber(String ccnum) {

		ccNumberField.sendKeys(ccnum);

	}

	public void CardDate(String month, String year) {
		
		CardMonthField.clear();
		CardYearField.clear();
		

		CardMonthField.sendKeys(month);

		CardYearField.sendKeys(year);

	}

	public void nameOnCard(String ccName) {

		NameOnCardField.sendKeys(ccName);
	}

	public void remmberMeCheckBox() {

		RemmberMeCheckboxField.click();
	}

	public void purchasebtn() {

		PurchaseBtnField.click();

	}

	 public  void confirmationText(String str) {
		 
		 if(ConfirmationTextField.equals(str)) { 
			 
			 System.out.println("Confirmation Message: "+ConfirmationTextField);
			 
		 } 
		 
		

		

	}

}
