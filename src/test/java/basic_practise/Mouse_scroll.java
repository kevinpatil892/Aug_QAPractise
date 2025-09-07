package basic_practise;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_scroll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser opened");
		
		driver.get("https://demoqa.com/buttons");
		System.out.println("URL Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//we use javascript interface and do casting with webdriver to share its methods--
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");     //+ value to scroll down
		System.out.println("Scrolled down");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");     //- value to scroll up
		System.out.println("Scrolled up");
	}

}
