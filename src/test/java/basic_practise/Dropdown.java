package basic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://demoqa.com/select-menu");
		System.out.println("URL opened");
		Thread.sleep(2000);
		
		WebElement dropdown= driver.findElement(By.xpath("(//html//body//div//select)[1]"));
		dropdown.click();
		System.out.println("Dropdown opened");
		Thread.sleep(2000);
		
		//use select class if available--
		Select s= new Select(dropdown);
		s.selectByIndex(2);
		System.out.println("Option 2 selected");     
		
//		s.selectByValue("5");
//		System.out.println("Option 5 selected");
//		
//		s.selectByVisibleText("Yellow");
//		System.out.println("Option yellow selected");
		
		//if select class not available then direct go with xpath of that option
		
		WebElement dropdown2= driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
		dropdown2.click();
		System.out.println("Dropdown opened");
		Thread.sleep(2000);
		
		
		
	}

}
