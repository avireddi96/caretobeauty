package com.caretobeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caretobeauty.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(id = "send")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(@class,'logo logo--regular')]")
	WebElement ctblogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCTBLogo() {
		return ctblogo.isDisplayed();
	}

	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		//return new HomePage();
	}

}
