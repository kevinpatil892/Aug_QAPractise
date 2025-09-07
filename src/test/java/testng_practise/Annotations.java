package testng_practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	//test ng works on annotations only
	//no main method is used here
	//annotations follows one sequence
	
	@BeforeTest
	public void testmethod()
	{
		System.out.println("Before test method");
	}
	
	@BeforeClass
	public void classmethod()
	{
		System.out.println("Before class method");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test execution method");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2 execution method");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("after class method");
	}
	
	@AfterTest
	public void aftertestmethod()
	{
		System.out.println("after test method");
	}
}
