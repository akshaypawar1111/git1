package Openbrowser;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child2 {
	public static void main(String[] args) throws InterruptedException {
		
		
		
	
			System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
				
				
				WebDriver driver= new ChromeDriver();
				
				
				

				
				driver.get("https://skpatro.github.io/demo/links/");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
		
		Set<String> tt = driver.getWindowHandles();
		
		ArrayList<String> a = new ArrayList<String>(tt);
		
		
		String id = a.get(0);   
		
		
		driver.switchTo().window(id);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//span[text()='Appium'])[1]")).click();
		
		
		
		
		
		
		
		
		
	}

}
