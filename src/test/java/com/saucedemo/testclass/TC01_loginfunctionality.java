package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.utilitypackage.UtilityClass;

public class TC01_loginfunctionality extends Base_testclass
{
	@Test
	public void loginmethod() throws IOException
	{
		
		String acturl="https://www.saucedemo.com/inventory.html";
		String expurl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl);
		UtilityClass.SS_method(driver);
	}

}
