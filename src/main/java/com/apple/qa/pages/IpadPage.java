package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class IpadPage extends TestBase {
	
	@FindBy(xpath="//div[@id='main']/section[1]/div[1]/div/span/a[2]")
	WebElement buyButton;
	
	public String validateIpadPageTitle()
	{
		return driver.getTitle();
	}
	
	public BuyIpadPage clickOnBuy()
	{
		buyButton.click();
		return new BuyIpadPage();
	}
	
	public IpadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
}
