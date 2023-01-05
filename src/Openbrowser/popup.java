package Openbrowser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		//Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> tt = driver.getWindowHandles();
		
		
		ArrayList<String> a = new ArrayList<String>(tt);
		
	String cc = a.get(1);
		
  driver.switchTo().window(cc);
  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
  Thread.sleep(3000);
  
System.out.println(driver.findElement(By.xpath("//h1[text()='Selenium online training']")).getText()); //driver.findElement(By.xpath("//h1[text()='Selenium online training']")).getText();
		
Thread.sleep(3000);
		driver.switchTo().window(a.get(0));
		
		
		
		
}
}