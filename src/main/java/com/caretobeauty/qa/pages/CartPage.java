package com.caretobeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caretobeauty.qa.base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//span[contains(@class,'cart')]")
	WebElement cartBtn;
	
	@FindBy(xpath="//button[contains(@class,'button btn-inline')]")
	WebElement viewAllCartBtn;
	
	@FindBy(xpath="//button[contains(@title,'Proceed to Checkout')]")
	WebElement proceedToCheckoutLink;
	
	


	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidatePageTitle() {
		return driver.getTitle();
	}

	public void validateViewCartbtn() {
		Actions a = new Actions(driver);
		a.moveToElement(cartBtn).build().perform();
		viewAllCartBtn.click();
	}
	
	public CheckoutPage validateProceedToCeckoutLink() {
		proceedToCheckoutLink.click();
		return new CheckoutPage();
	}

	
	
}
