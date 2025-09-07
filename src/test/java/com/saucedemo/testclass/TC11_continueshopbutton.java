package com.saucedemo.testclass;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.HomePage;

import junit.framework.Assert;

public class TC11_continueshopbutton extends Base_testclass
{
	@Test
	public void continueshopmethod() 
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		hp.clickcartmethod();
		
		CartPage c= new CartPage(driver);
		c.continueshopbuttonmethod();
		
		String expurl="https://www.saucedemo.com/inventory.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals("failed", expurl, acturl);
	}

}
