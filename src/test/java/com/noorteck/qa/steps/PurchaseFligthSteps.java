package com.noorteck.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.PurchaseFlightPage;
import com.noorteck.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseFligthSteps {

	PurchaseFlightPage purchase;
	
	

	@Given("User navigates to Purchase Page {string}")
	public void user_navigates_to_purchase_page(String url) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		// maximize the browser
		Constants.driver.manage().window().maximize();

		Constants.driver.get(url);
		
		
		
		
		Thread.sleep(2000);
		
		purchase = new PurchaseFlightPage(); 
	}

	


	@When("User enters name {string}")
	public void user_enters_name(String name) {

		purchase.enterName(name);
	}

	@When("User enters Address {string}")
	public void user_enters_address(String address) {

		purchase.enterAddress(address);

	}

	@When("User enters City {string}")
	public void user_enters_city(String city) {
	    
		purchase.City(city);
	}


	@When("User enters State {string}")
	public void user_enters_state(String state) {

		purchase.State(state);

	}

	@When("User enters ZipCode {string}")
	public void user_enters_zip_code(String zip) {

		purchase.ZipCode(zip);

	}

	@When("User selects Card Type {string}")
	public void user_selects_card_type(String cardType) {

		purchase.CardType(cardType);

	}

	@When("User enters Card Number {string}")
	public void user_enters_card_number(String cardnumber) {

		purchase.CardNumber(cardnumber);

	}

	@When("User enters Card Date {string} {string}")
	public void user_enters_card_date(String month, String year) {

		purchase.CardDate(month, year);

	}

	@When("User enters Card Name {string}")
	public void user_enters_card_name(String ccname) {

		purchase.nameOnCard(ccname);

	}

	@When("User clicks Remmeber Me Check Box")
	public void user_clicks_remmeber_me_check_box() {

		purchase.remmberMeCheckBox();

	}

	@When("User Clicks Submit button")
	public void user_clicks_submit_button() {

		purchase.purchasebtn();

	}

	@Then("User verifies confirmation message {string}")
	public void user_verifies_confirmation_message(String text) {

		purchase.confirmationText(text);
		
		Constants.driver.quit();

	}

}
