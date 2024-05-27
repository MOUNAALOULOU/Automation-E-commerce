package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class LoginWithIncorrectCredentialsPage extends BasePage {

	/* Retrieve element */
	


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Your email or password is incorrect!']")
	private static WebElement errorMsg;
 {
	

}
 
	public LoginWithIncorrectCredentialsPage() {
		super(Setup.getDriver());
	}
	
	
	public static WebElement getErrorMsg() {
		return errorMsg;
	}
}

