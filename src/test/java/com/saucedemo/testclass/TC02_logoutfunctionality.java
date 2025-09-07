package com.saucedemo.testclass;

import org.testng.annotations.Test;

import basic_practise.Base_Testclass;

public class TC02_logoutfunctionality extends Base_testclass
{
	@Test
	public void logoutmethod()
	{
		log.info("User loged out check after Afterclass method");
	}

}
