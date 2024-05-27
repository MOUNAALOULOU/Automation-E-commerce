package com.e2eTests.automation.step_definitions;



import com.e2eTests.automation.page_objects.RegisterUserWeMPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class RegisterUserWeMStepDefinitions {
	
	public RegisterUserWeMPage registerUserWeMPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SelectFromListUtils selectFromListUtils;

	public RegisterUserWeMStepDefinitions() {

		registerUserWeMPage = new RegisterUserWeMPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		selectFromListUtils = new SelectFromListUtils();

	}
	
	

	@Then("Verify that error message {string} is visible")
	public void verifyThatErrorMessageIsVisible(String string) {
		validations.isElementDisplayed(RegisterUserWeMPage.getErrorMsg1());
		
		
	
	
		
	}

}
