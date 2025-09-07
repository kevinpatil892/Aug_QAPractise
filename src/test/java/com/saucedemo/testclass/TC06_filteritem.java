package com.saucedemo.testclass;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.HomePage;

public class TC06_filteritem extends Base_testclass
{
	@Test
	public void filtermethod() throws InterruptedException
	{
		HomePage hp= new HomePage(driver);
		hp.filtermethod();
		hp.lowtohigh_method();
		
		
	}

}
