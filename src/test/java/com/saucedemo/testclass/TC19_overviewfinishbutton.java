package com.saucedemo.testclass;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.CheckoutPage;
import com.saucedemo.pomclass.HomePage;
import com.saucedemo.pomclass.OverviewPage;

import junit.framework.Assert;

public class TC19_overviewfinishbutton extends Base_testclass
{
	@Test
	public void overviewfinishmethod()
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		hp.clickcartmethod();
		
		CartPage c= new CartPage(driver);
		c.checkoutbuttonmethod();
		
		CheckoutPage p= new CheckoutPage(driver);
		p.infomethod();
		p.continuemethod();
		
		OverviewPage o= new OverviewPage(driver);
		o.finishmethod();
		
		String expurl="https://www.saucedemo.com/checkout-complete.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals("failed", expurl, acturl);
	}

}
