package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class RegisterUserPage extends BasePage {

	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//img[@alt='Website for automation practice']")
	private static WebElement automationExercise;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement signupLoginBtn;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newUserSignup;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement name;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	private static WebElement emailAdress;

	@FindBy(how = How.CLASS_NAME, using = "btn btn-default")
	private static WebElement signup;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Enter Account Information']")
	private static WebElement enterAccountInformation;

	@FindBy(how = How.ID, using = "uniform-id_gender2")
	private static WebElement mrsTitle;

	@FindBy(how = How.ID, using = "name")
	private static WebElement nameTitle;

	@FindBy(how = How.ID, using = "password")
	private static WebElement passwordTitle;

	@FindBy(how = How.ID, using = "days")
	private static WebElement dateOfBirthDay;

	@FindBy(how = How.ID, using = "months")
	private static WebElement dateOfBirthMonth;

	@FindBy(how = How.ID, using = "years")
	private static WebElement dateOfBirthYear;

	@FindBy(how = How.ID, using = "newsletter")
	private static WebElement checkboxSignUpForOurNewsletter;
	
	@FindBy(how = How.ID, using = "optin")
	private static WebElement receiveSpecialOffersFromOurPartners;
	
	
	
	public RegisterUserPage() {
		super(Setup.getDriver());

	}



    public static WebElement getAutomationExercise() {
	return automationExercise;
}
	public static WebElement getSignupLoginBtn() {
		return signupLoginBtn;
	}

	public static WebElement getNewUserSignup() {
		return newUserSignup;
	}

	public static WebElement getName() {
		return name;
	}

	public static WebElement getEmailAdress() {
		return emailAdress;
	}

	public static WebElement getSignup() {
		return signup;
	}

	public static WebElement getEnterAccountInformation() {
		return enterAccountInformation;
	}

	public static WebElement getMrsTitle() {
		return mrsTitle;

	}

	public static WebElement getNameTitle() {
		return nameTitle;
	}

	public static WebElement getPasswordTitle() {
		return passwordTitle;

	}

	public static WebElement getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public static WebElement getDateOfBirthMonth() {
		return dateOfBirthMonth;
	}

	public static WebElement getDateOfBirthYear() {

		return dateOfBirthYear;
	}

	public static WebElement getCheckboxSignUpForOurNewsletter() {

		return checkboxSignUpForOurNewsletter;
	}
	public static WebElement getReceiveSpecialOffersFromOurPartners() {

		return receiveSpecialOffersFromOurPartners;
	}
	
}
