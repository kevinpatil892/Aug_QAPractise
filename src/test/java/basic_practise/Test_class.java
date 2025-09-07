package basic_practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Openend");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Openend");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//now call pom class methods--
		POM_class p= new POM_class(driver);
		p.usermethod();
		p.passmethod();
		p.loginmethod();
		System.out.println("User loged in successfully");
		
		String acturl=driver.getCurrentUrl();
		String expurl="https://www.saucedemo.com/inventory.html";
		if(acturl.equals(expurl))
		{
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
		
		
	}

}
