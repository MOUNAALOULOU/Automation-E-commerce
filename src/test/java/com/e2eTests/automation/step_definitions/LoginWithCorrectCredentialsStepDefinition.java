package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginWithCorrectCredentialsPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class LoginWithCorrectCredentialsStepDefinition {

	public LoginWithCorrectCredentialsPage loginWithCorrectCredentialsPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SelectFromListUtils selectFromListUtils;

	public LoginWithCorrectCredentialsStepDefinition() {

		loginWithCorrectCredentialsPage = new LoginWithCorrectCredentialsPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		selectFromListUtils = new SelectFromListUtils();

	}

	@Then("Verify that logging to user account message is visible {string}")
	public void verifyThatLoggingToUserAccountMessageIsVisible(String message) {
		validations.isElementDisplayed(LoginWithCorrectCredentialsPage.getLoginToYourAccountMsg());

	}

	@Then("Enter correct email address {string}")
	public void enterCorrectEmailAddress(String email) {
		seleniumUtils.writeText(LoginWithCorrectCredentialsPage.getEmailAdressBtn(), email);

	}

	@Then("Enter correct password {string}")
	public void enterCorrectPassword(String password) {
		seleniumUtils.writeText(LoginWithCorrectCredentialsPage.getPasswordBtn(), password);

	}

	@Then("Click on login button")
	public void clickOnLoginButton() {
		seleniumUtils.click(LoginWithCorrectCredentialsPage.getLoginButn());

	}

	@Then("Verify that the logged user message is visible {string}")
	public void verifyThatTheLoggedUserMessageIsVisible(String string) {
		validations.isElementDisplayed(LoginWithCorrectCredentialsPage.getLoggedAsUserMessage());

	}

}
