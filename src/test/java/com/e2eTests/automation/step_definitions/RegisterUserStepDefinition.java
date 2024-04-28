package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.e2eTests.automation.page_objects.RegisterUserPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class RegisterUserStepDefinition {

	public RegisterUserPage registerUserPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public WebDriver driver = new ChromeDriver();

	public RegisterUserStepDefinition() {
		registerUserPage = new RegisterUserPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();

	}

	@Given("Navigate to the url")
	public void navigateToTheUrl() {
		driver.get("https://automationexercise.com/");
	}

	@When("Verify that home page is visible successfully")
	public void verifyThatHomePageIsVisibleSuccessfully() {
		String actualUrl = Setup.getDriver().getCurrentUrl();
		String expectedUrl = "https://automationexercise.com/";
		Assert.assertEquals(expectedUrl, actualUrl);

	}

	@Then("Click on Signup Login button")
	public void clickOnSignupLoginButton() {

		seleniumUtils.click(RegisterUserPage.getSignupLoginBtn());

	}

	@Then("Verify message new user signup {string} is visibles")
	public void verifyMessageNewUserSignupIsVisibles(String expectedMessage) {

	}

	@Then("Enter name {string}")
	public void enterName(String name) {
		seleniumUtils.writeText(RegisterUserPage.getName(), "MohamedAli");

	}

	@Then("Enter email address {string}")
	public void enterEmailAddress(String emailAdress) {
		seleniumUtils.writeText(RegisterUserPage.getEmailAdress(), emailAdress);
	}

	@Then("Click Signup button")
	public void clickSignupButton() {
		seleniumUtils.click(RegisterUserPage.getSignup());

	}

	@Then("Verify that message enter account information {string} is visible")
	public void verifyThatMessageEnterAccountInformationIsVisible(String string) {
		validations.isElementDisplayed(RegisterUserPage.getAutomationExercise());
	}

	@Then("I click on Mrs Btn")
	public void iClickOnMrsBtn() {
		seleniumUtils.click(RegisterUserPage.getMrsTitle());
		
	}

	@Then("Fill the details in the user account  fields")
	public void fillTheDetailsInTheUserAccountFields(DataTable dataTable) {
		
		 Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		 RegisterUserPage.getNameTitle().sendKeys(dataMap.get("name"));
		 RegisterUserPage.getPasswordTitle().sendKeys(dataMap.get("Password"));

	}

	@Then("Fill the Date of birth {string}")
	public void fillTheDateOfBirth(String string) {
        
	}

	@Then("Fill the month of birth {string}")
	public void fillTheMonthOfBirth(String string) {

	}

	@Then("Fill the year of birth {string}")
	public void fillTheYearOfBirth(String string) {

	}

	@Then("Select checkbox Sign up for our newsletter")
	public void selectCheckboxSignUpForOurNewsletter() {

	}

	@Then("Select checkbox Receive special offers from our partners")
	public void selectCheckboxReceiveSpecialOffersFromOurPartners() {

	}

	@Then("Fill the details in the input fields")
	public void fillTheDetailsInTheInputFields(io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("Click Create Account button")
	public void clickCreateAccountButton() {

	}

	@Then("Verify that acount created message is visible {string}")
	public void verifyThatAcountCreatedMessageIsVisible(String string) {

	}

	@Then("click Continue button")
	public void clickContinueButton() {

	}

	@Then("Verify that logged in as username message is visible {string}")
	public void verifyThatLoggedInAsUsernameMessageIsVisible(String string) {

	}

	@Then("Click Delete Account button")
	public void clickDeleteAccountButton() {

	}

	@Then("Verify that account deleted message is visible {string}")
	public void verifyThatAccountDeletedMessageIsVisible(String string) {

	}

}
