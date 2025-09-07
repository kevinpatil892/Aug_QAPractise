package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.CheckoutPage;
import com.saucedemo.pomclass.HomePage;
import com.saucedemo.pomclass.OverviewPage;
import com.saucedemo.utilitypackage.UtilityClass;


public class TC17_verifytotalamount extends Base_testclass
{
	@Test
	public void totalamountmethod() throws IOException
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
		o.verifyamountmethod();
		
		UtilityClass.SS_method(driver);
	}

}
