package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class RegisterUserWeMPage extends BasePage {
	

		
		
		/* Retrieve element */
		

		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/p[1]")
		private static WebElement errorMsg1;
		 public RegisterUserWeMPage() {
				super(Setup.getDriver());
			}
			 
		 public static WebElement getErrorMsg1() {
				return errorMsg1;
			}
		 
	 
	
	

}
