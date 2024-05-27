package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.JavascriptExecutor;
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

	@FindBy(how = How.XPATH, using = "//button[@data-qa='signup-button']")
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

	@FindBy(how = How.ID, using = "first_name")
	private static WebElement firstName;

	@FindBy(how = How.ID, using = "last_name")
	private static WebElement lastName;

	@FindBy(how = How.ID, using = "company")
	private static WebElement companyField;

	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	private static WebElement address1;

	@FindBy(how = How.ID, using = "address2")
	private static WebElement address2;

	@FindBy(how = How.ID, using = "country")
	private static WebElement countryField;

	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	private static WebElement stateField;

	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	private static WebElement cityField;

	@FindBy(how = How.ID, using = "zipcode")
	private static WebElement zipcodeField;

	@FindBy(how = How.ID, using = "mobile_number")
	private static WebElement mobileNumber;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Account']")
	private static WebElement createAccountBtn;

	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Created!']")
	private static WebElement accountCreatedField;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Continue']")
	private static WebElement continueBtn;
	
	//@FindBy(how = How.XPATH, using = "XXXXXXXXXXXXX")
	//private static WebElement alertBtn;

	@FindBy(how = How.XPATH, using = "//li[10]//a[1]")
	private static WebElement loggedInUser;
	
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Delete Account']")
	private static WebElement deleteAcountBtn;
	
	
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Deleted!']")
	private static WebElement acountDeleteField;
	
	               
	

	public RegisterUserPage() {
		super(Setup.getDriver());

	}

	public static WebElement getAutomationExercise() {
		JavascriptExecutor js = (JavascriptExecutor)Setup.getDriver();
		js.executeScript("const elements = document.querySelectorAll('.adsbygoogle.adsbygoogle-noablate'); for (let i = 0; i < elements.length; i++) elements[i].remove()");
		
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

	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getCompanyField() {
		return companyField;
	}

	public static WebElement getAddress1() {
		return address1;
	}

	public static WebElement getAddress2() {
		return address2;
	}

	public static WebElement getCountryField() {
		return countryField;
	}
	
	public static WebElement getStateField() {
		return stateField;
	}
	

	public static WebElement getCityField() {
		return cityField;

	}

	public static WebElement getZipcodeField() {
		return zipcodeField;
	}

	public static WebElement getMobileNumber() {
		return mobileNumber;
	}

	public static WebElement getCreateAccountBtn() {
		return createAccountBtn;

	}

	public static WebElement getAccountCreatedField() {
		return accountCreatedField;
	}
		
		
		public static WebElement getContinueBtn() {
			return continueBtn;
		
		
}
		public static WebElement getloggedInUser() {
			return loggedInUser;
			
		}
		public static WebElement getdeleteAcountBtn() {
			return deleteAcountBtn;
			
			
		}
		public static WebElement getAcountDeleteField() {
			return acountDeleteField;
			
			
			
		
		
	}

}
