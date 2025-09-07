package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.CheckoutPage;
import com.saucedemo.pomclass.HomePage;
import com.saucedemo.pomclass.OrdercompletePage;
import com.saucedemo.pomclass.OverviewPage;
import com.saucedemo.utilitypackage.UtilityClass;

import junit.framework.Assert;

public class TC22_ordercompletebackbutton extends Base_testclass
{
	@Test
	public void finalpagebackbuttonmethod() throws IOException
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
		
		OrdercompletePage x= new OrdercompletePage(driver);
		x.cancelmethod();
		
		String expurl="https://www.saucedemo.com/inventory.html";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals("failed", expurl, acturl);
		UtilityClass.SS_method(driver);
		
		//logout after order placement----
		hp.menumethod();
		hp.logoutmethod();
		System.out.println("user log out after order placement");
		
	}

}
