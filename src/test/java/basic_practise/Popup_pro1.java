package basic_practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup_pro1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =  new ChromeDriver();
 		driver.manage().window().maximize();
 		System.out.println("Browser Opened");
 		
// 		driver.get("https://demoqa.com/alerts");
// 		System.out.println("URL Opened");
// 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
 //(01) Hidden pop up--- this is just simple page and it is handled in regular way using selenium methods
 //ex:- facebook register page here URL remains same and all elements can be inspected in regular way
 	    
 //(02) Alert Pop up:- this comes when we click on element and first we have to response it then we go for page element
 //we can not inspect or click element of page without handling this pop up
 // to handle this we shift focus of selenium from main page to this alert using Alert interface
 	  
 	    //1.normal alert handle--
// 	    WebElement button=driver.findElement(By.xpath("(//html//button)[2]"));
// 	    button.click();
// 	    System.out.println("pop up opened");
// 	    
// 	    Alert alt=driver.switchTo().alert();
// 	    alt.accept();
// 	    System.out.println("Alert accepted");
// 	    Thread.sleep(2000);
 	    
 	    //2.alert comes aftr 5 sec--
// 	    WebElement button2=driver.findElement(By.xpath("(//html//button)[3]"));
// 	    button2.click();
// 	    
// 	    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
// 	    wait.until(ExpectedConditions.alertIsPresent());
// 	    
// 	    alt.accept();
// 	    System.out.println("Alert accepted after 5 sec");
// 	    Thread.sleep(2000);
// 	    
// 	   //3.alert dismiss--
// 	   WebElement button3=driver.findElement(By.xpath("(//html//button)[4]"));
//	   button3.click();
// 	    
//	   alt.dismiss();
//	   System.out.println("Alert rejected");
// 	   Thread.sleep(2000);
 	    
//	   //4.send text in alert--
//	   WebElement button4=driver.findElement(By.xpath("(//html//button)[5]"));
//	   button4.click();
// 	   
//	   alt.sendKeys("Pune");
//	   System.out.println("Text entered");
// 	   Thread.sleep(2000);
// 	   alt.accept();
// 	   System.out.println("After enter text alert accepted");
 	   
 //(3).Autheticator pop up--
 	 //user needs to provide id and pass to access url for security purpose
 	    
 	 driver.get("https://the-internet.herokuapp.com/basic_auth");
 	 System.out.println("URL opened but req authentication");
	 System.out.println("plz provide userid and pass");
	 
	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	 System.out.println("Authentication done");
	 
	//OR ---concatenation--
	    
//		String start = "https://";
//	    String url = "the-internet.herokuapp.com/basic_auth";
//	    
//	    String userName = "admin";
//	    String password = "admin";
//	
//	String finalUrl = start + userName + ":" + password + "@" + url;
//	
//	System.out.println(finalUrl);
//	driver.get(finalUrl);
	}

}
