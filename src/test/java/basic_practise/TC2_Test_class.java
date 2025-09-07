package basic_practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_Test_class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Openend");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Openend");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		POM_class p= new POM_class(driver);
		p.usermethod();
		p.passmethod();
		p.loginmethod();
		System.out.println("User loged in successfully");
		
		Home_page h= new Home_page(driver);
		h.addcartallmethod();
		System.out.println("All prod added to cart");
		
		h.sortmethod();
		h.ZtoAmethod();
		System.out.println("Sorting done");
			
		h.menumethod();
		h.logoutmethod();
		System.out.println("User loged out");
	}

}
