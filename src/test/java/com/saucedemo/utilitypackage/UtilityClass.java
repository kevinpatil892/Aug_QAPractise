package com.saucedemo.utilitypackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public WebDriver driver;
	
	public static void SS_method(WebDriver driver) throws IOException
	{
		Date date = new Date();
		DateFormat d = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String newDate = d.format(date);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\admin\\Desktop\\July_Automation\\image" + newDate + ".jpg");
		FileHandler.copy(source, dest);
	}

}
