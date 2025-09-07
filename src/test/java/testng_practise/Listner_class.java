package testng_practise;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_class implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("TC Started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("TC Passed");
	}
	
	public void onTestfailure(ITestResult result)
	{
		System.out.println("TC Failed");
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("TC Skipped");
	}
	
	
}
