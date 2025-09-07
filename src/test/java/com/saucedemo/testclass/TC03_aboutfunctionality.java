package com.saucedemo.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pomclass.HomePage;

public class TC03_aboutfunctionality extends Base_testclass
{
	@Test
	public void aboutmethod()
	{
		HomePage hp= new HomePage(driver);
		hp.menumethod();
		hp.aboutmethod();
		log.info("moved to about page");
		
		String aboutacturl=driver.getCurrentUrl();
		String aboutexpurl="https://saucelabs.com/";
		Assert.assertEquals(aboutacturl, aboutexpurl);
		
		driver.navigate().back();
		log.info("moved to home page");
	}

}
