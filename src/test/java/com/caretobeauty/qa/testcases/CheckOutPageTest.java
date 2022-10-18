package com.caretobeauty.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caretobeauty.qa.base.TestBase;
import com.caretobeauty.qa.pages.CartPage;
import com.caretobeauty.qa.pages.HomePage;
import com.caretobeauty.qa.pages.NutritionPage;

public class CheckOutPageTest extends TestBase {

	HomePage homePage;
	NutritionPage nutritionPage;
	CartPage cartPage;

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		homePage.clickOnNutritionLink();
		nutritionPage = new NutritionPage();
		nutritionPage.addProductsToCart();
		cartPage = new CartPage();
		cartPage.validateProceedToCeckoutLink();
	}
	
	public CheckOutPageTest() {
		super();
	}
	
	@Test
	public void validateCheckOutpage() {
		driver.getTitle();
	}

	

}


