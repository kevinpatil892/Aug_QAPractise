package testng_practise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertation 
{
	SoftAssert soft= new SoftAssert();
	
	@Test
	public void TC01_verifylogin()
	{
		String expurl="www.saucedemo.com";
		String acturl="www.saucedemo.com";
		soft.assertEquals(expurl, acturl, "TC failed");
		
	}
	
	@Test
	public void TC02_verifytitle()
	{
		String exptitle="Saucelab";
		String acttitle="Saucela";
		soft.assertEquals(exptitle, acttitle, "TC Failed");
		
	}
	
	@Test
	public void TC03_conditioncheck()
	{
		int a=50;
		int b=60;
		soft.assertTrue(a>b, "TC failed");
		soft.assertAll();
	}
	
      

}
