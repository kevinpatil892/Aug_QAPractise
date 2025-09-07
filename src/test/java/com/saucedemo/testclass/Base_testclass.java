package com.saucedemo.testclass;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;


import com.saucedemo.pomclass.HomePage;
import com.saucedemo.pomclass.LoginPage;

@Listeners(com.saucedemo.utilitypackage.Listener_class.class)

public class Base_testclass 
{
	public WebDriver driver;
	public Logger log;
//	@Parameters("browserName")
	
	@BeforeClass
	public void broswermethod(String browserName)
	{
		log= LogManager.getLogger(Base_testclass.class);
	
		
//		if(browserName.equals("chrome"))
//		{
//			driver= new ChromeDriver();
//		}
//		else if(browserName.equals("firefox"))
//		{
//			driver= new FirefoxDriver();
//		}
//		else
//		{
//			System.out.println("System shows error");
//		}
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Browser opened");
		driver.get("https://www.saucedemo.com/");
		log.info("URL Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	@BeforeMethod
	public void setupmethod()
	{
		LoginPage lp= new LoginPage(driver);
		lp.usermethod();
		lp.passmethod();
		lp.loginmethod();
		log.info("user Loged in successfully");
	}
	@AfterMethod
	public void teardownmethod()
	{
		HomePage hp=new HomePage(driver);
		hp.menumethod();
		hp.logoutmethod();
		log.info("user Loged out successfully");
	}
	@AfterClass
	public void browserclose()
	{
		driver.close();
		log.info("Browser closed successfully");
	}

}
