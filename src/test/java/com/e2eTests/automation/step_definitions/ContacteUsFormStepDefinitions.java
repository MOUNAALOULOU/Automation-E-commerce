package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.ContacteUsFormPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.UploadFile;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class ContacteUsFormStepDefinitions {

	public ContacteUsFormPage contacteUsFormPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public UploadFile uploadFile;

	public ContacteUsFormStepDefinitions() {

		contacteUsFormPage = new ContacteUsFormPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
		uploadFile = new UploadFile();

	}

	@Then("Click on contactUs button")
	public void clickOnContactUsButton() throws InterruptedException {
		Thread.sleep(5000);
		// seleniumUtils.click(ContactUsPage.getAutoriserBtn());
		seleniumUtils.click(ContacteUsFormPage.getContactUsBtn());
	}

	@Then("Verify that contact us message form {string} is visible")
	public void verifyThatContactUsMessageFormIsVisible(String message) {
		validations.isElementDisplayed(ContacteUsFormPage.getContactUsMsg());

	}

	@Then("Enter the subject {string}")
	public void enterTheSubject(String subject) {
		seleniumUtils.writeText(ContacteUsFormPage.getSubjectField(), subject);
	}

	@Then("Enter the message {string}")
	public void enterTheMessage(String message) {
		seleniumUtils.writeText(ContacteUsFormPage.getMessageField(), message);
	}

	@Then("click on Download folder button")
	public void clickOnDownloadFolderButton() {
		uploadFile.uploadFileWithSendKeys(
				"C:\\Users\\33772\\eclipse-workspace\\JobInterviewQA\\src\\test\\java\\com\\e2eTestInterview\\automation\\utils\\Test.txt",
				ContacteUsFormPage.getUploadBtn());
	}

	@Then("Click on submit button")
	public void clickOnSubmitButton() {
		seleniumUtils.click(ContacteUsFormPage.getSubmitBtn());

	}

	@Then("Click on OK button alert")
	public void clickOnOKButtonAlert() {
		seleniumUtils.acceptAlert();

	}

	@Then("Verify the success message is visible {string}")
	public void verifyTheSuccessMessageIsVisible(String string) {
		validations.isElementDisplayed(ContacteUsFormPage.getMsg());

	}

	@Then("click on Home button")
	public void clickOnHomeButton() {
		seleniumUtils.click(ContacteUsFormPage.getHomeBtn());

	}

}
