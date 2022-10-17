package com.caretobeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caretobeauty.qa.base.TestBase;
import com.caretobeauty.qa.pages.HomePage;
import com.caretobeauty.qa.pages.LoginPage;
import com.caretobeauty.qa.pages.NutritionPage;

public class NutritionPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	NutritionPage nutritionPage;

	public NutritionPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		nutritionPage = new NutritionPage();
		homePage = new HomePage();
		homePage.clickOnNutritionLink();
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), "password");
	}

	@Test(priority = 1)
	public void verifyPageTitle() {
		String title = nutritionPage.validatePageTitle();
		Assert.assertEquals(title, "Nutrition India · Buy Nutrition Beauty Supplements Online - Care to Beauty");
	}

	@Test(priority = 2)
	public void verifyNutritionPageHeadTest() {
		boolean flag = nutritionPage.validateNutritionPageHead();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void addProductToCart() {
		nutritionPage.addProductsToCart();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
