package com.saucedemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class OrdercompletePage 
{
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="(//html//body//span)")
	private WebElement verifyfinalpagetext;
	
	@FindBy(xpath="(//html//body//h2)")
	private WebElement verifythankyoutext;
	
	@FindBy(xpath="(//html//body//button)[3]")
	private WebElement backhome;
	
	public OrdercompletePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyordercompletetext()
	{
		String exptext="Checkout: Complete!";
		String acttext= verifyfinalpagetext.getText();
		System.out.println(acttext);
		
		Assert.assertEquals("failed", exptext, acttext);
	}
	
	public void verifythankyoumethod()
	{
		String exptext="Thank you for your order!";
		String acttext=verifythankyoutext.getText();
		System.out.println(acttext);
		
		Assert.assertEquals("failed", exptext, acttext);
	}
	
	public void cancelmethod()
	{
		backhome.click();
		System.out.println("Clicked on backhome and moved back to Home page");
	}

}
