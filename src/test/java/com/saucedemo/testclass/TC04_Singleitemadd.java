package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.HomePage;
import com.saucedemo.utilitypackage.UtilityClass;

public class TC04_Singleitemadd extends Base_testclass
{
	@Test
	public void singleitemmethod() throws IOException
	{
		HomePage hp= new HomePage(driver);
		hp.singleitemmethod();
		log.info("single itme added to cart");
		
		hp.checkremovetext();
		UtilityClass.SS_method(driver);
	}
	

}
