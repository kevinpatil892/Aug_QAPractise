package com.saucedemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class OverviewPage 
{
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="(//html//body//span)[2]")
	private WebElement verifyoverview;
	
	@FindBy(xpath="(//html//body//button)[3]")
	private WebElement cancel;
	
	@FindBy(xpath="(//html//body//button)[4]")
	private WebElement finish;
	
	@FindBy(xpath="(//html//body//div)[38]")
	private WebElement verifyamount;
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyoveviewtext()
	{
		String exptext="Checkout: Overview";
		String acttext= verifyoverview.getText();
		System.out.println(acttext);
		
		Assert.assertEquals("failed", exptext, acttext);
	}
	
	public void verifyamountmethod()
	{
		String exptext="Total: $10.79";
		String acttext=verifyamount.getText();
		System.out.println(acttext);
		
		Assert.assertEquals("failed", exptext, acttext);
	}
	
	public void cancelmethod()
	{
		cancel.click();
		System.out.println("Clicked on cancel and moved back to Home page");
	}
	
	public void finishmethod()
	{
		finish.click();
		System.out.println("clicked on finish and moved to Ordercomplete page");
		System.out.println("Order placed successfully");
	}

}
