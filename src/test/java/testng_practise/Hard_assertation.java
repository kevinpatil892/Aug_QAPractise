package testng_practise;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testng_practise.Listner_class.class)

public class Hard_assertation 
{
	@BeforeMethod
	public void setup()
	{
		System.out.println("user loged in");
	}

	@Test
	public void TC01_verifylogin()
	{
		String expurl="www.saucedemo.com";
		String acturl="www.saucedem.com";
		
		Assert.assertEquals(expurl, acturl, "TC Failed");
	}
	
	@Test
	public void TC02_verifytitle()
	{
		String exptitle="Saucelab";
		String acttitle="Saucelab";
		
		Assert.assertEquals(exptitle, acttitle, "TC Failed");
	}
	
	@Test
	public void TC03_conditioncheck()
	{
		int a=50;
		int b=60;
		Assert.assertTrue(a<b, "TC failed");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("user log out");
	}
}
