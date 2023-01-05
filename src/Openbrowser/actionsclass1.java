package Openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionsclass1 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
			
			
			WebDriver driver= new ChromeDriver();
			
			
			

			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l ')])[1]")).click();
			
			Thread.sleep(2000);
			
			WebElement p = driver.findElement(By.xpath("//a[text()='Login']"));    //step1
			
			Actions a = new  Actions(driver);  //step 2
			
			a.moveToElement(p).perform();;
			
			
			
			
			
}
}