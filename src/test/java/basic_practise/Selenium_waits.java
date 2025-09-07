package basic_practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Selenium_waits 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser opened");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL Opened");
		
//(1) implicit wait is used once in starting, it works globally to match script and browser speed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //2nd way
		
//		WebElement name=driver.findElement(By.id("name"));
//		name.sendKeys("Ketan");
//		
//		WebElement confirmbutton=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
//		confirmbutton.click();
		
//(2)explicit wait use for particular element which takes time to load on page
//in particular conditions this wait is used--
		
		WebElement window = driver.findElement(By.xpath("//a[@id='opentab']"));
		window.click();
		window.click();
		System.out.println("Clicked twice on window, 2nd and 3rd tab opened");

		// Wait until 3 windows are present
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.numberOfWindowsToBe(3));

		// Collect window handles
		List<String> address = new ArrayList<>(driver.getWindowHandles());

		// Switch to the 3rd tab (index 2)
		driver.switchTo().window(address.get(2));

		// Perform action on the 3rd tab
		WebElement courses = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		courses.click();
		System.out.println("User clicked on courses on 3rd tab");
		
//(3)Fluent exception hard to use because of syntax and use for pooling frequency and expected conditions both		
//thread.sleep is pure java concept and used to pause java script not browser speed		
	}

}
