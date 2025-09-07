package basic_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_methods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("URL opened");
		Thread.sleep(2000);
		
		//1.sendkeys user id:
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");
		
		//2.Clear method:
		user.clear();
		Thread.sleep(2000);
		user.sendKeys("Admin");
		Thread.sleep(2000);
		
		
		//3.to get size of element--
		Dimension d=user.getSize();
		System.out.println("Size is-"+ d);
		
		//4.to get position--
		Point p=user.getLocation();
		System.out.println("Position is-"+ p);
		
		//sendkeys pass:
		WebElement pass=driver.findElement(By.xpath("(//html//body//div//input)[3]"));
		pass.sendKeys("admin123");
		Thread.sleep(2000);
		
		//5.getattribute:
		String attvalue= pass.getAttribute("type");
		System.out.println(attvalue);
		
		//6.gettext:
		WebElement forgetpass= driver.findElement(By.xpath("(//html//body//div//p)[3]"));
		String text= forgetpass.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		//7.Click method:
		WebElement login= driver.findElement(By.xpath("(//html//body//div//button)[1]"));
		login.click();
		
		
		
				
				
	}

}
