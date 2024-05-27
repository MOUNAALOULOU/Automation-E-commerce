package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SearchProductPage extends BasePage {

	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//input[@id='search_product']")
	private static WebElement searchProductField;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-search']")
	private static WebElement searchBtn;
	

	@FindBy(how = How.XPATH, using = "//h2[@class='title text-center']")
	private static WebElement searchedProductMsg;
	
	


	public SearchProductPage() {
		super(Setup.getDriver());
	}

	public static WebElement getSearchProductField() {
		return searchProductField;
		
	}
	public static WebElement getSearchBtn() {
		return searchBtn;
		
	}
	public static WebElement getSearchedProductMsg() {
		return searchedProductMsg;
	
	
}
}