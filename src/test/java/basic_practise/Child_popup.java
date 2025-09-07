package basic_practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Opened");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//this pop up comes when we click on any element and new window or tab openes---
//so to move focus of selenium on child tab we use switchto.window method by passing address
//to find address we use getwindowhandles method which return set interface so cast to list		
		
		WebElement button=driver.findElement(By.xpath("(//html//body//div//fieldset//a)[1]"));
		button.click();
		System.out.println("child browser window opened");
		
		//to move to child page first we need to find address of it given below--
	    String mainpageadd=driver.getWindowHandle();  //main page address
		System.out.println(mainpageadd);
		
	   Set<String> bothadd=driver.getWindowHandles(); //main & child address
	   System.out.println(bothadd);
	   
//	   //but set dont have index property to we do casting of it--
//	   List<String> childadd= new ArrayList<String>(bothadd);
//	   
//	   driver.switchTo().window(childadd.get(1));
	   
	   //OR directly use below syntax after clicked on element--
	   List<String> child2= new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(child2.get(1));
	   
	  //now click on elements of child pop up tab--
	   WebElement source=driver.findElement(By.xpath("(//html//body//nav//div//ul//li//a)[2]"));
	   source.click();
	   System.out.println("clicked on child pop up button");
		
	}

}
