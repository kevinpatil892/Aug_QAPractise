package basic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_method2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println("URL opened");
		Thread.sleep(2000);
		
		//1.isDisplayed:
//		WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//		hideButton.click();
//		
//		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//		boolean result = textBox.isDisplayed();
//		System.out.println(result);      //false
		
		//2.isEnabled:
//		WebElement textbox2 = driver.findElement(By.xpath("//div[@id='city']"));
//		boolean result1=textbox2.isEnabled();
//		System.out.println(result1);
		
		//isSelected:
		WebElement textbox3 = driver.findElement(By.xpath("(//html//body//div//input)[4]"));
		boolean result2=textbox3.isSelected();
		System.out.println(result2);

		
	}

}
