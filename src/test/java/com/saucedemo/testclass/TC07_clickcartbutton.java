package com.saucedemo.testclass;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.HomePage;

import junit.framework.Assert;

public class TC07_clickcartbutton extends Base_testclass
{
	@Test
	public void cartmethod() 
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		hp.clickcartmethod();
		
		String expurl="https://www.saucedemo.com/cart.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals("failed", expurl, acturl);
		
	}

}
