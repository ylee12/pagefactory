package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class HomePage extends TestBase{
	
	// page Factor
	
	@FindBy(xpath="//a[text()='iPad']")
	WebElement iPad;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String validateAppleHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public IpadPage clickOnIpad()
	{
		iPad.click();
		return new IpadPage();
	}
}
	