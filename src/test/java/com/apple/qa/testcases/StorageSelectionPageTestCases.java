package com.apple.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apple.qa.base.TestBase;
import com.apple.qa.pages.BuyIpadPage;
import com.apple.qa.pages.ConnectivityPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.StorageSelectionPage;

public class StorageSelectionPageTestCases extends TestBase{

	HomePage homepage;
	BuyIpadPage buyipadpage;
	StorageSelectionPage storage;
	ConnectivityPage connectivity;
	
	
	public StorageSelectionPageTestCases()
	{
		super();
	}
	

	@BeforeMethod
	public void setUp()
	{
		initialisation();
		homepage = new HomePage();
		homepage.clickOnIpad();
		buyipadpage.clickOnSilverIpadBuyBtn();
		storage = new StorageSelectionPage();
	}
	@Test
	public ConnectivityPage clickOn32GB()
	{
		connectivity = storage.ClickonStorageLink();
		return new ConnectivityPage();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
