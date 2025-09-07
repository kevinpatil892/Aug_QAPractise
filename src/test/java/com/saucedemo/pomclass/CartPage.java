package com.saucedemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class CartPage 
{
	private WebDriver driver;
	private Select s;
	  
	@FindBy(xpath="//span[text()='Your Cart']")
	private WebElement cartpagetext;
	
	@FindBy(xpath="(//html//body//button)[3]")
	private WebElement removebutton;
	
	@FindBy(xpath="(//html//body//button)[5]")
	private WebElement checkoutbutton;
	
	@FindBy(xpath="(//html//body//button)[4]")
	private WebElement continueshopbutton;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void carttextmethod()
	{
		String exptext="Your Cart";
		String acttext=cartpagetext.getText();
		Assert.assertEquals("failed", exptext, acttext);
	}
	
	public void removebuttonmethod()
	{
		removebutton.click();
		System.out.println("Item removed");
	}
	
	public void checkoutbuttonmethod()
	{
		checkoutbutton.click();
		System.out.println("Clicked on checkout and move to checkout page");
	}
	
	public void continueshopbuttonmethod()
	{
		continueshopbutton.click();
		System.out.println("moved back to home page");
	}

}
