package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SearchProductPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class SearchProductStepDefinitions {
	
	public class SearchProductStepDefinitons {
		
		public SearchProductPage searchProductPage;
		public SeleniumUtils seleniumUtils;
		public ConfigFileReader configFileReader;
		public Validations validations;
		

		public SearchProductStepDefinitons() {
			searchProductPage = new SearchProductPage();
			seleniumUtils = new SeleniumUtils();
			configFileReader = new ConfigFileReader();
			validations = new Validations();
		}


		@Then("Enter product name {string} in search input")
		public void enterProductNameInSearchInput(String dress) {
			seleniumUtils.writeText(SearchProductPage.getSearchProductField(), dress);
		}
		@Then("Click on search button")
		public void clickOnSearchButton() {
			seleniumUtils.click(SearchProductPage.getSearchBtn());
		}
	
		@Then("Verify that the searched products message is visible {string}")
		public void verifyThatTheSearchedProductsMessageIsVisible(String string) {
			validations.isElementDisplayed(SearchProductPage.getSearchedProductMsg());

		}
		@Then("Verify all the products related to search are visible")
		public void verifyAllTheProductsRelatedToSearchAreVisible() {
		   
		}



		
}
}