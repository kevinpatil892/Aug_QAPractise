package com.saucedemo.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="(//html//body//input)[1]")
	private WebElement username;
	
	@FindBy(xpath="(//html//body//input)[2]")
	private WebElement pass;
	
	@FindBy(xpath="(//html//body//input)[3]")
	private WebElement loginbutton;
	
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement pagetext;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void usermethod()
	{
	   username.sendKeys("standard_user");	
	}
	
	public void passmethod()
	{
	   pass.sendKeys("secret_sauce");	
	}
	
	public void loginmethod()
	{
	   loginbutton.click();	
	}
	
	public void textmethod()
	{
		String text= pagetext.getText();
		System.out.println("Loginpage text is "+text);
	}

}
