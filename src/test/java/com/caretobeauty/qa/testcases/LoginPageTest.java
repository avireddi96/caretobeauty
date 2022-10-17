package com.caretobeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.caretobeauty.qa.base.TestBase;
import com.caretobeauty.qa.pages.HomePage;
import com.caretobeauty.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Care to Beauty India · Online Shop · from Care to Beauty products");
	}

	@Test(priority = 2)
	public void validateCTBlogoTest() {
		boolean flag = loginPage.validateCTBLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginTest() {
		// homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
