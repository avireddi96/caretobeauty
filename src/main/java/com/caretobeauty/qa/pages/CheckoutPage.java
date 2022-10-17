package com.caretobeauty.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.caretobeauty.qa.base.TestBase;

public class CheckoutPage extends TestBase {

	
	@FindBy()
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
}
