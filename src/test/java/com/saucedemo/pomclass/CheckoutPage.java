package com.saucedemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class CheckoutPage 
{
	WebDriver driver;
	private Select s;
	
	@FindBy(xpath="(//html//body//input)[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//html//body//input)[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//html//body//input)[3]")
	private WebElement zipcode;
	
	@FindBy(xpath="(//html//body//input)[4]")
	private WebElement continuebutton;

	@FindBy(xpath="(//html//body//button)[3]")
	private WebElement canclebutton;
	
	@FindBy(xpath="(//html//body//span)[2]")
	private WebElement checkouttext;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void infomethod()
	{
		firstname.sendKeys("Ketan");
		lastname.sendKeys("Patil");
		zipcode.sendKeys("123654");
		System.out.println("user info filled");
	}
	
	public void continuemethod()
	{
		continuebutton.click();
		System.out.println("moved to overview page");
	}
	
	public void canclemethod()
	{
		canclebutton.click();
		System.out.println("clicked on cancle and moved back to cart page");
	}
	
	public void checkouttextmethod()
	{
		String exptext="Checkout: Your Information";
		String acttext= checkouttext.getText();
		System.out.println(acttext);
		Assert.assertEquals("failed", exptext, acttext);
	}

}
