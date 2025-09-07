package testng_practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 
{
	@BeforeClass
	public void setupbrowser()
	{
		System.out.println("Browser and URL open");
	}
	
	@BeforeMethod
	public void setuplogin()
	{
		System.out.println("User loged in");
	}

	@Test
	public void verifytestcase1()
	{
		System.out.println("TC Veirfy 1");
	}
	
	@Test
	public void verifytestcase2()
	{
		System.out.println("TC Veirfy 2");
	}
	
	@AfterMethod
	public void setuplogout()
	{
		System.out.println("User loged out");
	}
	
	@AfterClass
	public void setupbrowserclose()
	{
		System.out.println("Browser close program end");
	}
}
