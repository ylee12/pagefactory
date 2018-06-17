package com.apple.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apple.qa.base.TestBase;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.IpadPage;

public class HomePageTestCase extends TestBase{
	
	HomePage homepage;
	IpadPage ipadpage;
	
	public HomePageTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialisation();
		homepage = new HomePage();
		
	}
	
	@Test(priority = 1)
	public void homePageTitleTest()
	{
		String title = homepage.validateAppleHomePageTitle();
		AssertJUnit.assertEquals(title, "Apple");
	}
	
	@Test(priority = 2)
	public void clickOnIpad()
	{
		ipadpage = homepage.clickOnIpad();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
