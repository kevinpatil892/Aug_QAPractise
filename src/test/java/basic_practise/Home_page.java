package basic_practise;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_page 
{
	private WebDriver driver;
	private Actions act;
	private Select s;
	
	
	@FindBy(xpath="//html//body//select")
	private WebElement sortbutton;
	
	@FindBy(xpath="(//html//body//button)[1]")
	private WebElement menubutton;
	
	@FindBy(xpath="(//html//body//nav//a)[3]")
	private WebElement logoutbutton;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> alladdocart; 
	
	
	public Home_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act= new Actions(driver);
	}
	
	public void sortmethod() 
	{
		sortbutton.click();
		System.out.println("clicked on sort");
	}
	
	public void ZtoAmethod() 
	{
		s= new Select(sortbutton);
		s.selectByIndex(1);
		
		System.out.println("ZtoA option Selected");
	}
	public void menumethod() 
	{
		menubutton.click();
		System.out.println("clicked on menu");
	}
	public void logoutmethod() 
	{
		logoutbutton.click();
		System.out.println("clicked on logout option");
	}
	public void addcartallmethod() throws InterruptedException
	{
		int size=alladdocart.size();
		System.out.println(size);
		for(int i=0;i<alladdocart.size();i++)
		{
			alladdocart.get(i).click();
			Thread.sleep(2000);
		}
	}
}
