package basic_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrag_drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser opened");
		
		driver.get("https://testautomationcentral.com/demo/drag_and_drop.html");
		System.out.println("URL Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//we declare actions class globally and we can use when required
		Actions act= new Actions(driver);
		
		WebElement dragtext=driver.findElement(By.xpath("(//html//body//div//main//div)[2]"));
		WebElement droptext= driver.findElement(By.xpath("(//html//body//div//main//div)[3]"));
		
		act.dragAndDrop(dragtext, droptext).perform();
		System.out.println("draged and dropped done");
		Thread.sleep(2000);
		
//		WebElement image2=driver.findElement(By.xpath("(//html//body//div//ul//img)[2]"));
//		
//		act.dragAndDrop(image2, box).perform();
//		System.out.println("image2 draged and dropped");
		
	}

}
