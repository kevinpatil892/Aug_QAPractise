package basic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_program 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Opened");
		
		//(1) with ID--
		
		WebElement user= driver.findElement(By.id("user-name"));
		user.sendKeys("Kevin");
		
		WebElement user1=driver.findElement(By.className("input_error form_input"));
		user1.clear();
		
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("KP");
		
		WebElement pass1=driver.findElement(By.tagName("input"));
		pass1.clear();
		
		WebElement login=driver.findElement(By.linkText(""));
		login.clear();
		
		
		
	}

}
