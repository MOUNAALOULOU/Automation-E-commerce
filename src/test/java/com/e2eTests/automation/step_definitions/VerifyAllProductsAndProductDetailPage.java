package com.e2eTests.automation.step_definitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class VerifyAllProductsAndProductDetailPage extends BasePage {

	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//a[@href='/products']")
	private static WebElement productBtn;

	@FindBy(how = How.XPATH, using = ("//div"))
	private static WebElement listOfElements;
	

	@FindBy(how = How.XPATH, using = ("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]"))
	private static WebElement firstViewProductBtn;

	@FindBy(how = How.XPATH, using = ("//h2[normalize-space()='Blue Top']"))
	private static WebElement productName;

	@FindBy(how = How.XPATH, using = ("//p[normalize-space()='Category: Women > Tops']"))
	private static WebElement productCategory;

	@FindBy(how = How.XPATH, using = ("//span[normalize-space()='Rs. 500']"))
	private static WebElement productPrice;

	@FindBy(how = How.XPATH, using = ("//b[normalize-space()='Availability:']"))
	private static WebElement productAvailability;

	@FindBy(how = How.XPATH, using = ("//b[normalize-space()='Condition:']"))
	private static WebElement productCondition;

	@FindBy(how = How.XPATH, using = ("//b[normalize-space()='Brand:']"))
	private static WebElement productBrand;

	
	public VerifyAllProductsAndProductDetailPage() {
		super(Setup.getDriver());
	}

	public static WebElement getProductBtn() {
		return productBtn;
	}

	public static WebElement getListOfElements() {
		return listOfElements;
	}

	public static WebElement getFirstViewProductBtn() {
		return firstViewProductBtn;

	}

	public static WebElement getProductName() {
		return productName;
	}

	public static WebElement getProductCategory() {
		return productCategory;
	}

	public static WebElement getProductPrice() {
		return productPrice;
	}

	public static WebElement getProductAvailability() {
		return productAvailability;
	}

	public static WebElement getProductCondition() {
		return productCondition;
	}

	public static WebElement getProductBrand() {
		return productBrand;
	}

}
