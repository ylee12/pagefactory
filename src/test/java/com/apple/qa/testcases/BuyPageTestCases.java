package com.apple.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apple.qa.base.TestBase;
import com.apple.qa.pages.AddBage;
import com.apple.qa.pages.BuyIpadPage;
import com.apple.qa.pages.BuyPage;
import com.apple.qa.pages.ConnectivityPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.IpadPage;
import com.apple.qa.pages.StorageSelectionPage;

public class BuyPageTestCases extends TestBase{
	HomePage homepage;
	IpadPage ipadpage;
	BuyIpadPage buyipadpage;
	StorageSelectionPage storagepage;
	ConnectivityPage connnectivity;
	BuyPage buypage;
	
	public BuyPageTestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialisation();
		homepage = new HomePage();
		homepage.clickOnIpad();
		ipadpage = new IpadPage();
		ipadpage.clickOnBuy();
		buyipadpage= new BuyIpadPage();
		buyipadpage.clickOnSilverIpadBuyBtn();
		storagepage = new StorageSelectionPage(); 
		storagepage.ClickonStorageLink();
		connnectivity = new ConnectivityPage();
		buypage = new BuyPage();
		
	}

	@Test(priority=1)
	public void AddAppleCare()
	{
		buypage.ClickOnAppleCare();
	}
	
	@Test(priority=2)
	public AddBage ClickOnContinue()
	{
		buypage.ClickOnContinue();
		return new AddBage();
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
