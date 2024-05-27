package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.RegisterUserPage;
import java.util.Map;
import org.junit.Assert;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegisterUserStepDefinition {

	public RegisterUserPage registerUserPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SelectFromListUtils selectFromListUtils;

	public RegisterUserStepDefinition() {
		registerUserPage = new RegisterUserPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		selectFromListUtils = new SelectFromListUtils();

	}

	@Given("Navigate to the url")
	public void navigateToTheUrl() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
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
		validations.isElementDisplayed(RegisterUserPage.getAutomationExercise());

	}

	@Then("Enter name {string}")
	public void enterName(String name) {
		seleniumUtils.writeText(RegisterUserPage.getName(), name);

	}

	@Then("Enter email address {string}")
	public void enterEmailAddress(String emailAdress) {
		seleniumUtils.writeText(RegisterUserPage.getEmailAdress(), emailAdress);
	}

	@Then("Click Signup button")
	public void clickSignupButton() {
		 seleniumUtils.click(RegisterUserPage.getSignup());
		// seleniumUtils.switchToNewWindow(null, null) switchTo().alert().accept();
		// seleniumUtils.click(null);
		// WebElement btnClickMe = driver.findElement(By.id("alertButton"));

	}

	@Then("Verify that message enter account information {string} is visible")
	public void verifyThatMessageEnterAccountInformationIsVisible(String string) {
		validations.isElementDisplayed(RegisterUserPage.getEnterAccountInformation());
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
		selectFromListUtils.selectDropDownListByValue(RegisterUserPage.getDateOfBirthDay(), "21");

	}

	@Then("Fill the month of birth {string}")
	public void fillTheMonthOfBirth(String string) {
		selectFromListUtils.selectDropDownListByVisibleText(RegisterUserPage.getDateOfBirthMonth(), "April");
	}

	@Then("Fill the year of birth {string}")
	public void fillTheYearOfBirth(String string) {
		selectFromListUtils.selectDropDownListByValue(RegisterUserPage.getDateOfBirthYear(), "1981");

	}

	@Then("Select checkbox Sign up for our newsletter")
	public void selectCheckboxSignUpForOurNewsletter() {
		seleniumUtils.click(RegisterUserPage.getCheckboxSignUpForOurNewsletter());

	}

	@Then("Select checkbox Receive special offers from our partners")
	public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
		seleniumUtils.click(RegisterUserPage.getReceiveSpecialOffersFromOurPartners());
	}

	@Then("Fill the details in the input fields")
	public void fillTheDetailsInTheInputFields(DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		RegisterUserPage.getFirstName().sendKeys(dataMap.get("First name"));
		RegisterUserPage.getLastName().sendKeys(dataMap.get("Last name"));
		RegisterUserPage.getCompanyField().sendKeys(dataMap.get("Company"));
		RegisterUserPage.getAddress1().sendKeys(dataMap.get("Address"));
		RegisterUserPage.getAddress2().sendKeys(dataMap.get("Address2"));
		RegisterUserPage.getCountryField().sendKeys(dataMap.get("Country"));
		RegisterUserPage.getStateField().sendKeys(dataMap.get("State"));
		RegisterUserPage.getCityField().sendKeys(dataMap.get("City"));
		RegisterUserPage.getZipcodeField().sendKeys(dataMap.get("Zipcode"));
		RegisterUserPage.getMobileNumber().sendKeys(dataMap.get("Mobile Number"));

	}

	@Then("Click Create Account button")
	public void clickCreateAccountButton() {
		seleniumUtils.click(RegisterUserPage.getCreateAccountBtn());

	}

	@Then("Verify that acount created message is visible {string}")
	public void verifyThatAcountCreatedMessageIsVisible(String string) {
		validations.isElementDisplayed(RegisterUserPage.getAccountCreatedField());

	}

	@Then("click Continue button")
	public void clickContinueButton() {
		seleniumUtils.click(RegisterUserPage.getContinueBtn());

	}

	@Then("Verify that logged in as username message is visible {string}")
	public void verifyThatLoggedInAsUsernameMessageIsVisible(String string) {
		validations.isElementDisplayed(RegisterUserPage.getloggedInUser());

	}

	@Then("Click Delete Account button")
	public void clickDeleteAccountButton() {
		seleniumUtils.click(RegisterUserPage.getdeleteAcountBtn());

	}

	@Then("Verify that account deleted message is visible {string}")
	public void verifyThatAccountDeletedMessageIsVisible(String string) {
		validations.isElementDisplayed(RegisterUserPage.getAcountDeleteField());

	}

}
