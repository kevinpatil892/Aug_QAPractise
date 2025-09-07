package basic_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser opened");
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("URL Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//we declare actions class globally and we can use when required
		Actions act= new Actions(driver);
		
		WebElement singleclick= driver.findElement(By.xpath("(//html//body//button)[4]"));
		act.click(singleclick).perform();
		System.out.println("single click done");
		Thread.sleep(2000);
		
		WebElement doubleclick= driver.findElement(By.xpath("(//html//body//button)[2]"));
		act.doubleClick(doubleclick).perform();
		System.out.println("double click done");
		Thread.sleep(2000);
		
		WebElement rightclick= driver.findElement(By.xpath("(//html//body//button)[3]"));
		act.contextClick(rightclick).perform();
		System.out.println("right click done");
		Thread.sleep(2000);
		
		WebElement move= driver.findElement(By.xpath("//h1[text()='Buttons']"));
		act.moveToElement(move).perform();
		System.out.println("moved to element done");
		
	}

}
