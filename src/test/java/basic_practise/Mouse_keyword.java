package basic_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_keyword 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser opened");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("URL Opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement user=driver.findElement(By.xpath("(//html//body//input)[2]"));
		user.sendKeys("admin");
		Thread.sleep(2000);
		
		//we declare actions class globally and we can use when required
		Actions act= new Actions(driver);
		
		//to select all and copy text
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		
		//to paste text
		WebElement pass=driver.findElement(By.xpath("(//html//body//input)[3]"));
		act.click(pass).perform();
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//for special keys--
//		act.sendKeys(Keys.SPACE).perform();
//		act.sendKeys(Keys.BACK_SPACE).perform();
//		act.sendKeys(Keys.SHIFT).perform();
//		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
	}

}
