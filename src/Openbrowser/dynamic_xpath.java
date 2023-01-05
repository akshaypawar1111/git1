package Openbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_xpath 
{
public static void main(String[] args) {
	
	
	

	System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
		
		
		WebDriver driver= new ChromeDriver();
		
		
		

		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung note 20 ultra");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	WebElement mobile = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]"));
	
	//mobile.click();
	
	System.out.println(mobile.getText());
	
	
}
}
