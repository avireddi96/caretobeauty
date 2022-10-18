package com.caretobeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caretobeauty.qa.base.TestBase;
import com.caretobeauty.qa.pages.CartPage;
import com.caretobeauty.qa.pages.HomePage;
import com.caretobeauty.qa.pages.NutritionPage;

public class CartPageTest extends TestBase {

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
	}
	
	public CartPageTest() {
		super();
	}

	@Test(priority = 1)
	public void verifyPageTitle() {
		String title = cartPage.ValidatePageTitle();
		Assert.assertEquals(title, "Shopping Cart\r\n");
	}

	@Test(priority = 2)
	public void verifyViewCartPage() {
		cartPage.validateViewCartbtn();
	}

	@Test(priority = 3)
	public void verfiyProceedToCheckoutLink() {
		cartPage.validateProceedToCeckoutLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
