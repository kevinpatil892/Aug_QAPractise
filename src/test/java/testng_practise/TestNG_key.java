package testng_practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_key 
{
	
	@BeforeMethod
	public void setuplogin()
	{
		System.out.println("User loged in");
	}

	@Test(priority=-1)
	public void TestA()
	{
		System.out.println("TCA");
	}
	
	@Test(invocationCount=3)
	public void TestB()
	{
		System.out.println("TCB");
	}
	
	@Test(dependsOnMethods= {"CTest"})
	public void TestE()
	{
		System.out.println("TCE");
	}
	
	@Test(priority=-1)
	public void CTest()
	{
		System.out.println("TCC");
	}

	@Test(enabled=false)
	public void TestD()
	{
		System.out.println("TCD");
	}
	
	@Test(timeOut=2000)
	public void TestF() throws InterruptedException
	{
		System.out.println("TCF");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void setuplogout()
	{
		System.out.println("User loged out");
	}
	

}
