package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class BuyIpadPage extends TestBase{
	
	@FindBy(xpath="//input[@value='silver']")
	WebElement silverLink;
	
	public BuyIpadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateIpagBuyPageTitle()
	{
		return driver.getTitle();
	}
	
	public StorageSelectionPage clickOnSilverIpadBuyBtn()
	{
		silverLink.click();
		return new StorageSelectionPage();
	}
	

}
