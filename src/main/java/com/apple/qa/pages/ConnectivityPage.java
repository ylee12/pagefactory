package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class ConnectivityPage extends TestBase{
	
	@FindBy(xpath="//input[@value='wificell']")
	WebElement wificell;
	
	public ConnectivityPage()
	{
		PageFactory.initElements(driver, this);
	}

	public BuyPage clickOnWifiCellLink()
	{
		wificell.click();
		return new BuyPage();
	}

	
}
