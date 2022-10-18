package com.caretobeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caretobeauty.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(linkText = "NUTRITION")
	WebElement nutritionlink;

	@FindBy(css = ".logo--regular [alt]")
	WebElement homePageLogo;

	@FindBy(xpath = "//a[contains(@title,'Log Out')]")
	WebElement logOutBtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateHomePageLogo() {
		return homePageLogo.isDisplayed();
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public NutritionPage clickOnNutritionLink() {
		nutritionlink.click();
		return new NutritionPage();
	}

}
