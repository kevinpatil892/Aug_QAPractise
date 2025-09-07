package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.CheckoutPage;
import com.saucedemo.pomclass.HomePage;
import com.saucedemo.utilitypackage.UtilityClass;

import junit.framework.Assert;

public class TC15_checkoutcontinuebutton extends Base_testclass
{
	@Test
	public void checkoutcontinuemethod() throws IOException
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		hp.clickcartmethod();
		
		CartPage c= new CartPage(driver);
		c.checkoutbuttonmethod();
		
		CheckoutPage p= new CheckoutPage(driver);
		p.infomethod();
		p.continuemethod();
		
		String expurl="https://www.saucedemo.com/checkout-step-two.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals("failed", expurl, acturl);
		
		UtilityClass.SS_method(driver);
	}

}
