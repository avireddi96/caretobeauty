package com.caretobeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caretobeauty.qa.base.TestBase;
import com.caretobeauty.qa.pages.HomePage;
import com.caretobeauty.qa.pages.LoginPage;
import com.caretobeauty.qa.pages.NutritionPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	NutritionPage nutritionPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		nutritionPage = new NutritionPage();
		 homePage=new HomePage();
//		loginPage = new LoginPage();
//		homePage = loginPage.login(prop.getProperty("username"), "password");
	}

	@Test(priority = 1)
	public void homePageLogoTest() {
		boolean flag = homePage.validateHomePageLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void validateHomePageTitleTest() {
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Care to Beauty India · All Your Cosmetics At Your Fingertips",
				"HomePage Title is Not Matched.");
	}

	@Test(priority = 3)
	public void verifyNutritionLinkTest() {
		nutritionPage = homePage.clickOnNutritionLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
