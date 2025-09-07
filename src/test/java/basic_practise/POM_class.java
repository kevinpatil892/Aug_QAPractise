package basic_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_class 
{
	private WebDriver driver;
	
	@FindBy(xpath="(//html//body//input)[1]")
	private WebElement username;
	
	@FindBy(xpath="(//html//body//input)[2]")
	private WebElement pass;
	
	@FindBy(xpath="(//html//body//input)[3]")
	private WebElement login;
	
	public POM_class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void usermethod()
	{
		username.sendKeys("standard_user");
		System.out.println("Id enetered");
	}
	
	public void passmethod()
	{
		pass.sendKeys("secret_sauce");
		System.out.println("pass enetered");
	}
	
	public void loginmethod()
	{
		login.click();
		System.out.println("clicked login button");
	}
}
