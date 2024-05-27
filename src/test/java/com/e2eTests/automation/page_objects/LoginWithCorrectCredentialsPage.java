package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class LoginWithCorrectCredentialsPage extends BasePage {

	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Login to your account']")
	private static WebElement loginToYourAccountMsg;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement emailAdressBtn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement passwordBtn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement loginButn;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")
	private static WebElement loggedAsUserMessage;

	public LoginWithCorrectCredentialsPage() {
		super(Setup.getDriver());

	}

	public static WebElement getLoginToYourAccountMsg() {
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("const elements = document.querySelectorAll('.adsbygoogle.adsbygoogle-noablate'); for (let i = 0; i < elements.length; i++) elements[i].remove()");

		return loginToYourAccountMsg;
	}

	public static WebElement getEmailAdressBtn() {
		return emailAdressBtn;
	}

	public static WebElement getPasswordBtn() {
		return passwordBtn;
	}

	public static WebElement getLoginButn() {
		return loginButn;

	}

	public static WebElement getLoggedAsUserMessage() {

		return loggedAsUserMessage;

	}

}
