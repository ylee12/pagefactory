package com.apple.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	static public WebDriver driver;
	static Properties pro;
	
	public TestBase() 
	{
		
		try {
			pro = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/apple/qa/config/config.properties");
			// FileInputStream fis = new FileInputStream("C:/Users/sgubbala/eclipse-workspace/Java Scrips/Exilantcode/src/main/java/com/apple/qa/config/config.properties");
			
			pro.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void initialisation()
	{
		String browserName = pro.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/selenium-web-browser-dvr-mac/chromedriver");
			driver = new ChromeDriver();
		}else if(browserName.equals("ff")) {
			System.setProperty("webdriver.geckodriver.driver", System.getProperty("user.dir")+"/drivers/selenium-web-browser-dvr-mac/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("url"));
	}
	
	
}
