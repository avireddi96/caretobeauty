package com.caretobeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.caretobeauty.qa.base.TestBase;

public class NutritionPage extends TestBase {

	@FindBy(xpath = "//div[contains(@class,'logo-wrapper logo-wrapper--regular')]")
	WebElement nutritionPageHead;

	@FindBy(xpath = "//a[contains(@title,'Nourkrin Woman Hair Growth Tablets x60')]")
	WebElement hairGrowthProduct;

	@FindBy(id = "product-addtocart-button")
	WebElement addProduct;

	@FindBy(linkText = "NUTRITION")
	WebElement nutritionlink;

	@FindBy(xpath = "//a[contains(@title,'Heliocare Sun Capsules x60')]")
	WebElement sunCapsules;

	@FindBy(xpath = "Heliocare Sun Capsules x60")
	WebElement grow;

	@FindBy(xpath = "Bioclin Bio-Force Food Supplement x60")
	WebElement bioFood;

	public NutritionPage() {
		PageFactory.initElements(driver, this);
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean validateNutritionPageHead() {
		return nutritionPageHead.isDisplayed();
	}

	public CartPage addProductsToCart() {
		hairGrowthProduct.click();
		addProduct.click();
		nutritionlink.click();
		sunCapsules.click();
		addProduct.click();
//		nutritionlink.click();
//		bioFood.click();
//		addProduct.click();
		return new CartPage();
	}

}
