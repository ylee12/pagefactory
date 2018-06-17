package com.apple.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apple.qa.base.TestBase;
import com.apple.qa.pages.BuyIpadPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.IpadPage;

public class IpadPageTestCases extends TestBase{
	
	HomePage homepage;
	IpadPage ipadpage;
	BuyIpadPage buyipadpage;
	

	public IpadPageTestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialisation();
		homepage = new HomePage();
		ipadpage =homepage.clickOnIpad();
	
		
	}
	
	@Test
	public void verifyIpadPageTitle()
	{
		String title = ipadpage.validateIpadPageTitle();	
		AssertJUnit.assertEquals(title, "iPad - Apple");
		
	}
	
	@Test
	public void clickOnIpadBuyButton()
	{
		buyipadpage = ipadpage.clickOnBuy();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
