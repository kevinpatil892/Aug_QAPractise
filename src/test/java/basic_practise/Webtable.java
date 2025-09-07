package basic_practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser opened");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> heading=driver.findElements(By.xpath("//table/tbody//tr/th"));
		int cellsize=heading.size();
		System.out.println("total columns are-"+ cellsize);
		
		for(int i=0;i<cellsize;i++)
		{
			 System.out.println(heading.get(i).getText()); 
		}
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody//tr/td"));
		int rowsize=rows.size();
		System.out.println("total rows are-"+ rowsize);
		
		for(int j=0;j<rowsize;j++)
		{
			System.out.println(rows.get(j).getText());
		}
	}

}
