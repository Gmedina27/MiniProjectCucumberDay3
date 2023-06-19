package com.noorteck.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//1
	@RunWith(Cucumber.class)
	
	
  //2
	
	@CucumberOptions(
			
			    features = "src/test/resources/MiniProject",
			    glue = "com.noorteck.qa.steps",
			    tags = "@scrum",
			    plugin = {"pretty","html:target/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			    monochrome = true 
			
			
			)
	
	
	

public class PurchaseFlightRunner {
	
	
	
	
	

}
