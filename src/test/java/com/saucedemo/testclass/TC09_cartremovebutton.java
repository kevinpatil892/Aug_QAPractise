package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.HomePage;
import com.saucedemo.utilitypackage.UtilityClass;

public class TC09_cartremovebutton extends Base_testclass
{
	@Test
	public void cartremovemethod() throws IOException 
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		hp.clickcartmethod();
		
		CartPage c= new CartPage(driver);
		{
			c.removebuttonmethod();
			UtilityClass.SS_method(driver);
		}
		
	}

}
