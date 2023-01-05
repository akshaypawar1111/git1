package Openbrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot
{
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	
	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(ss);
	
	
	File ff =new File("E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\screenshot.jpg");
	
	
	FileHandler.copy(ss, ff);
	
	
	
	
	
	
	
}
}
