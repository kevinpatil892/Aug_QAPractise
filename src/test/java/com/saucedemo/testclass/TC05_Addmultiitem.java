package com.saucedemo.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.saucedemo.pomclass.HomePage;
import com.saucedemo.utilitypackage.UtilityClass;

public class TC05_Addmultiitem extends Base_testclass
{
	@Test
	public void Addmultiitem() throws IOException
	{
		HomePage hp= new HomePage(driver);
		hp.allitemadd();
		hp.allitemtext();
		UtilityClass.SS_method(driver);
	}

}
