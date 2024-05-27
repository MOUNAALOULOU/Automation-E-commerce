package com.e2eTests.automation.step_definitions;

import org.junit.Assert;


import com.e2eTests.automation.page_objects.VerifyTestCasePage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTestCaseStepDefinitions {

	public VerifyTestCasePage verifyTestCasePage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;

	public VerifyTestCaseStepDefinitions(){
		
	 verifyTestCasePage = new VerifyTestCasePage();
	 seleniumUtils = new SeleniumUtils();
	 configFileReader = new ConfigFileReader();
	 validations = new Validations();
		
	}
	
	@When("Click on the Test Cases button")
	public void clickOnTheTestCasesButton() {
		seleniumUtils.click(VerifyTestCasePage.getTestCasesBtn());
		

	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
		String actualUr1 = Setup.getDriver().getCurrentUrl();
		String expectedUr1 = "https://automationexercise.com/test_cases";
		Assert.assertEquals(expectedUr1, actualUr1);
		
		
		// validations.isElementDisplayed(VerifyTestCasePage.getTestCasesBtn());

		
		

	}

}
