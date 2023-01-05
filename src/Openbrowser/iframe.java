package Openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe 
{
public static void main(String[] args) throws InterruptedException {
	
	
	
System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://iframetester.com/");
	
	Thread.sleep(2000);
	driver.switchTo().frame("iframe-window");         //String  frame ID         //this function will switch selenium focus from main page to iframe
	
//driver.switchTo().frame();            //int frame index
	
	//driver.switchTo().frame("iframeResult");             //String frame Name

		driver.findElement(By.xpath("//h2[text()='Test a url to see if it can be displayed in an iframe']")).click();
		
		Thread.sleep(2000);
		
		//driver.switchTo().defaultContent();       //this function is used to navigate from iframe to main page
		
	//	driver.switchTo().parentFrame();         //this function is used to navigate from iframe to main page
		                                               //(from child frame to immediate parent)
		
		
		
		
		
	//	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
		
		
		//driver.switchTo().defaultContent();
	
	
	
	
	
}
}
	
	
	
	
	
}
}
