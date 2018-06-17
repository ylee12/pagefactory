package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class StorageSelectionPage extends TestBase{
	
	@FindBy(xpath="//input[@value='32gb']")
	WebElement StorageLink;
	
	public StorageSelectionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ConnectivityPage ClickonStorageLink()
	{
		StorageLink.click();
		return new ConnectivityPage();
	}
	
}


