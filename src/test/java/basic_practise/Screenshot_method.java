package basic_practise;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_method 
{
	static WebDriver driver;
	
	public static void screenshot1(WebDriver driver) throws IOException
	{	
		Date date = new Date();
		DateFormat d = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String newDate = d.format(date);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\admin\\Desktop\\July_Automation\\image" + newDate + ".jpg");
		FileHandler.copy(source, dest);
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser opened");
		Thread.sleep(2000);
		
		Screenshot_method.screenshot1(driver);
		System.out.println("Login page SS taken");
		
		WebElement user= driver.findElement(By.xpath("(//html//body//div//input)[2]"));
		user.sendKeys("Admin");
		
		WebElement pass= driver.findElement(By.xpath("(//html//body//div//input)[3]"));
		pass.sendKeys("admin123");
		
		WebElement loginbutton= driver.findElement(By.xpath("//html//body//div//button"));
		loginbutton.click();
		Thread.sleep(2000);
		
		Screenshot_method.screenshot1(driver);
		System.out.println("After Login Home page SS taken");
		
	}
	
	

}
