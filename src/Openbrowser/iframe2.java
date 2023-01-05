package Openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2
{
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
			
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://iframetester.com/");
			
			Thread.sleep(2000);
			driver.switchTo().frame("iframe-window");    //to switch selenium focus from main pg to iframe
			
			String text = driver.findElement(By.xpath("//h2[text()='Test a url to see if it can be displayed in an iframe']")).getText();
			System.out.println(text);
			Thread.sleep(2000);
			
			 
			driver.switchTo().defaultContent();   //   to switch selenium focus from  iframe to selenium
			
			
			
			
}
}