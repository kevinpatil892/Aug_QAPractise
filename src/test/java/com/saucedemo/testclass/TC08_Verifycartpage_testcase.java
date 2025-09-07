package com.saucedemo.testclass;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.CartPage;
import com.saucedemo.pomclass.HomePage;

public class TC08_Verifycartpage_testcase extends Base_testclass
{
	@Test
	public void verifycartpage_method() 
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		hp.clickcartmethod();
		
		CartPage c= new CartPage(driver);
		c.carttextmethod();
	}

}
