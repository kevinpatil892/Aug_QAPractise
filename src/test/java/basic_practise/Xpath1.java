package basic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("URL opened");
		Thread.sleep(2000);
		
		//1.Xpath by attribute--
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");
		Thread.sleep(2000);
		
		//to get size of element--
		Dimension d=user.getSize();
		System.out.println("Size is-"+ d);
		
		//to get position--
		Point p=user.getLocation();
		System.out.println("Position is-"+ p);
		
		//2.Xpath by text--
		WebElement pass=driver.findElement(By.xpath("//input[text()='password']"));
		pass.sendKeys("Admin123");
		Thread.sleep(2000);
		
		//3.1-->Xpath by contains by Attribute--
		WebElement user1=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		pass.sendKeys("Admin");
		Thread.sleep(2000);
		
		//3.2-->Xpath by contains by text--
		WebElement forgetpass=driver.findElement(By.xpath("//div[contains(text(),'Forgot your password?')]"));
		forgetpass.click();
		Thread.sleep(2000);
		
		//4.Xpath by index--
		WebElement login=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		login.click();
		Thread.sleep(2000);
		
		//Absolute xpath--
		WebElement user2=driver.findElement(By.xpath("/html/head/body/style/div/form/div/input"));
		user2.sendKeys("admin");    //we avoid this it takes time
		Thread.sleep(2000);
		
		//Relative xpath--
		WebElement pass2=driver.findElement(By.xpath("//html//head//body//div//form//input"));
		pass2.sendKeys("Admin123");
		Thread.sleep(2000);
		
		driver.close();
	}
	

}
