package Openbrowser;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class webdriver_methods 
{
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", 
			"E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe\\");
	
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	Thread.sleep(3000);
	
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 Thread.sleep(3000);
	
	
      WebElement qq = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
      Thread.sleep(3000);
	Actions a = new Actions(driver);
	a.click(qq).perform();
	
	 Thread.sleep(3000);
	
	a.sendKeys(Keys.HOME).perform();
	
	
	
	 Thread.sleep(3000);
		
	
	a.sendKeys(Keys.ARROW_DOWN).perform();
	
	
	 Thread.sleep(3000);
		
	a.doubleClick(qq).perform();
	
	
	
	
}}
