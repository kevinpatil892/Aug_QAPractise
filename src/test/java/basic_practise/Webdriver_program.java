package basic_practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_program 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser opened");
		
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL Opened");
		
//		WebDriver driver1= new FirefoxDriver();
//		driver1.manage().window().maximize();
//		System.out.println("firefox browser opened");
//		
//		driver1.get("https://www.saucedemo.com/");
//		System.out.println("URL opened");
		
		//methods of webdriver---
		//(1) get---to open url
		//(2) navigate.To ----for open url (saves history)
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("URL opened with navigate method");
		Thread.sleep(2000);
		
		//(3)navigate.back---to get back page
		driver.navigate().back();
		System.out.println("back on home page");
		Thread.sleep(2000);
		
		//(4)navigate.forward--to get next page
		driver.navigate().forward();
		System.out.println("forward to next page");
		Thread.sleep(2000);
		
		//(5)refresh---
	    driver.navigate().refresh();
	    System.out.println("refresh done");
	    Thread.sleep(2000);
	    
	    //(6)maximize--
	    //(7)get current url--
	    String url=driver.getCurrentUrl();
	    System.out.println("URL is "+url);
	    Thread.sleep(2000);
		
	    //(8)get title of website--
	    String title= driver.getTitle();
	    System.out.println("title is "+title);
	    Thread.sleep(2000);
	    
	     //(9)set size of browser--
		 Dimension d= new Dimension(750,550);
		 driver.manage().window().setSize(d);
		 System.out.println("dimension set successfully");
		 Thread.sleep(2000);
		   
		  //(10)set position---
		  Point p = new Point(400,250);
		  driver.manage().window().setPosition(p);
		  System.out.println("position set Successfully");
		  Thread.sleep(2000);
		  
		   //(11)current window close--
		   driver.close();
		   System.out.println("window closed");
		   Thread.sleep(2000);
		   
		   //(12) browser quit--
		   driver.quit();
		   System.out.println("browser quit");
	}

}
