package Openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class locators 
{
public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(3000);
	
	
	boolean tt = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
	
	
	System.out.println(tt);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
