package Openbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup 
{
public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("file:///E:/html/sample6_multiplecountry.html");
	
	
	
	
	
//	driver.get("https://www.flipkart.com/");
//	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	
//	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshay");
//	
//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
	
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("akshay");
	 
	 Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Thread.sleep(3000);
	
	Alert tt = driver.switchTo().alert();
	
	Thread.sleep(3000);
	tt.accept();
//	tt.dismiss();
	
	
	
}
}
