package com.e2eTests.automation.step_definitions;



import org.junit.Assert;


import com.e2eTests.automation.page_objects.LogoutUserPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;


public class LogoutUserStepDefinition {
	public LogoutUserPage logoutUserPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SelectFromListUtils selectFromListUtils;
	public LogoutUserStepDefinition() {

		logoutUserPage = new LogoutUserPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		selectFromListUtils = new SelectFromListUtils();
	}

	
	@Then("Click Logout button")
	public void clickLogoutButton() {
		seleniumUtils.click(LogoutUserPage.getLogoutBtn());
		
	    
	}
	@Then("Verify that that user is navigated to login page")
	public void verifyThatThatUserIsNavigatedToLoginPage() {
		
			String actualUrl2 = Setup.getDriver().getCurrentUrl();
			String expectedUrl2 = "https://automationexercise.com/login";
			Assert.assertEquals(expectedUrl2, actualUrl2);

	}



}
