package com.e2eTests.automation.step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;

public class VerifyAllProductsAndProductDetailStepDefinitions {

	public VerifyAllProductsAndProductDetailPage verifyAllProductsAndProductDetailPage;
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public SelectFromListUtils selectFromListUtils;

	public VerifyAllProductsAndProductDetailStepDefinitions() {

		verifyAllProductsAndProductDetailPage = new VerifyAllProductsAndProductDetailPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	@Then("Click on Products button")
	public void clickOnProductsButton() {
		seleniumUtils.click(VerifyAllProductsAndProductDetailPage.getProductBtn());
	}

	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
		String actualUr1 = Setup.getDriver().getCurrentUrl();
		String expectedUr1 = "https://automationexercise.com/products";
		Assert.assertEquals(expectedUr1, actualUr1);
	}
	

	@Then("verify The products list is visible")
	public void verifyTheProductsListIsVisible() {
		seleniumUtils.findElements(VerifyAllProductsAndProductDetailPage.getListOfElements());
	}


	@Then("Click on View Product of the first product")
   public void clickOnViewProductOfTheFirstProduct() {
		seleniumUtils.click(VerifyAllProductsAndProductDetailPage.getFirstViewProductBtn());
	}

	@Then("User is landed to product detail page")
	public void userIsLandedToProductDetailPage() {
		String actualUr1 = Setup.getDriver().getCurrentUrl();
		String expectedUr1 = "https://automationexercise.com/product_details/1";
		Assert.assertEquals(expectedUr1, actualUr1);
}
	
	@Then("Verify that product name detail {string} is visible")
	public void verifyThatProductNameDetailIsVisible(String productname) {
		validations.isElementDisplayed(VerifyAllProductsAndProductDetailPage.getProductName());
	   
	}
	@Then("Verify that product category detail {string} is visible")
	public void verifyThatProductCategoryDetailIsVisible(String productcategory) {
		validations.isElementDisplayed(VerifyAllProductsAndProductDetailPage.getProductCategory());
		
	}
	@Then("Verify that product price detail {string} is visible")
	public void verifyThatProductPriceDetailIsVisible(String productprice) {
		validations.isElementDisplayed(VerifyAllProductsAndProductDetailPage.getProductPrice());
	    
	}
	@Then("Verify that product availability detail {string} is visible")
	public void verifyThatProductAvailabilityDetailIsVisible(String productavailability) {
		validations.isElementDisplayed(VerifyAllProductsAndProductDetailPage.getProductAvailability());
	   
	}
	@Then("Verify that product condition detail {string} is visible")
	public void verifyThatProductConditionDetailIsVisible(String string) {
		validations.isElementDisplayed(VerifyAllProductsAndProductDetailPage.getProductCondition());
	    
	}
	@Then("Verify that product brand detail {string} is visible")
	public void verifyThatProductBrandDetailIsVisible(String string) {
		validations.isElementDisplayed(VerifyAllProductsAndProductDetailPage.getProductBrand());
		
	    
	}



	
	
}


	
	