package basic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://www.flipkart.com/");
		System.out.println("URL opened");
		Thread.sleep(2000);
		
		//dropdown without select class--
		//user action class for hover on  dropdown element
		
		Actions act = new Actions(driver);
		
		WebElement login= driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		
		WebElement giftcard= driver.findElement(By.xpath("(//li[@class='AT0fUR'])[6]"));
		giftcard.click();
		
		System.out.println("moved to giftcard page");
		
	}
	

}
