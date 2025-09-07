package basic_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Openend");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL Openend");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//Iframe---select frame element and find xpath of it--
		
		WebElement frame=driver.findElement(By.xpath("(//html//body//iframe)[1]"));
		driver.switchTo().frame(frame);
		System.out.println("entered to frame 1");
		
		Actions act= new Actions(driver);
		WebElement more= driver.findElement(By.xpath("(//html//body//div//nav//li)[9]"));
		act.moveToElement(more).perform();
		Thread.sleep(2000);
		
		WebElement about=driver.findElement(By.xpath("(//html//body//div//nav//ul//li//a)[10]"));
		about.click();
		System.out.println("Click about button");
		
		//now move back to main page--
		driver.switchTo().defaultContent();  //this moves to main page direct
//		driver.switchTo().parentFrame();     //this moves to immediate parent
		Thread.sleep(2000);
		
		WebElement hide=driver.findElement(By.xpath("(//html//div//input)[11]"));
		hide.click();
		System.out.println("moved back to main page and clicked hide button");
		
		
		
		
		
		
	}

}
