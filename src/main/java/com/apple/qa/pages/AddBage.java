package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class AddBage extends TestBase{
	
	@FindBy(xpath="name=add-to-cart")
	WebElement addtoCart;
	
	public AddBage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ReviewPage addToCart()
	{
		addtoCart.click();
		return new ReviewPage();
		
	}

}
