package pack1;

import org.testng.annotations.Test;

public class TestNG_Keywords 
{
	@Test(invocationCount=2)                   //run 2 times
	public void method1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=1)
	public void method2()
	{
		System.out.println("test 2");
	}
	
	@Test(priority=-1)                         //this will run first
	public void method3()
	{
		System.out.println("test 3");
	}
	
	@Test(enabled=false)                      //this will be skipped 
	public void method4()
	{
		System.out.println("test 4");
	}
	
	@Test(timeOut=2000)                     //this will take 2 second to execute
	public void method5()
	{
		System.out.println("test 5");
	}

	@Test(dependsOnMethods={"method2"})     //this depends on method2 if fails then this also do not execute
	public void method6()
	{
		System.out.println("test 6");
	}
	
}
