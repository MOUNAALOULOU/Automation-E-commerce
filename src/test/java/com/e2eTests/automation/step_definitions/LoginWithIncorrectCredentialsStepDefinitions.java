package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginWithIncorrectCredentialsPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class LoginWithIncorrectCredentialsStepDefinitions {
	

public LoginWithIncorrectCredentialsPage loginWithIncorrectCredentialsPage;
public SeleniumUtils seleniumUtils;
public ConfigFileReader configFileReader;
public Validations validations;
public SelectFromListUtils selectFromListUtils;
public LoginWithIncorrectCredentialsStepDefinitions() {

	loginWithIncorrectCredentialsPage = new LoginWithIncorrectCredentialsPage();
	seleniumUtils = new SeleniumUtils();
	configFileReader = new ConfigFileReader();
	validations = new Validations();
	selectFromListUtils = new SelectFromListUtils();
}



	
	@Then("Verify the error message is visible {string}")
	public void verifyTheErrorMessageIsVisible(String message) {
		validations.isElementDisplayed(LoginWithIncorrectCredentialsPage.getErrorMsg());
		
	    
	}




}
