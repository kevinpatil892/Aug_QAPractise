package com.saucedemo.utilitypackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.saucedemo.testclass.Base_testclass;

public class Listener_class implements ITestListener
{
    public WebDriver driver;
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("test case failed ");
		
		this.driver =((Base_testclass)Result.getInstance()).driver;
		
		try 
		{
			UtilityClass.SS_method(driver);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("test case success ");
	}
	
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("test case skipped");
	}

}
