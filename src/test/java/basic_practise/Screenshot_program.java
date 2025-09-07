package basic_practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_program 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
		driver.get("https://demoqa.com/select-menu");
		System.out.println("URL opened");
		Thread.sleep(2000);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\admin\\Desktop\\July_Automation\\demo_qa.jpg");
		FileHandler.copy(source, dest);
		
		System.out.println("Screenshot taken");
		
		
	}
	

}
