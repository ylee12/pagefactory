package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.base.TestBase;

public class BuyPage extends TestBase{

		@FindBy(xpath="//div[@id='main']/section[1]/div[1]/div/span/a[2]")
		WebElement AddAppleCare;
		
		@FindBy(xpath="//button[@data-autom='addAppleCare']")
		WebElement Add;
		
		@FindBy(xpath="//button[@title='Continue']")
		WebElement ButtonContinue;
		
		public BuyPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void ClickOnAppleCare()
		{
			String parentWindow = driver.getWindowHandle();
			AddAppleCare.click();
			for(String Subwindow:driver.getWindowHandles())
			{
				driver.switchTo().window(Subwindow);
			}
			
			Add.click();
		}
		

		public AddBage ClickOnContinue()
		{
			ButtonContinue.click();
			return new AddBage();
		}
	
}
