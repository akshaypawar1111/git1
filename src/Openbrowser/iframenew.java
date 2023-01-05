package Openbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframenew 
{
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	


//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	Thread.sleep(2000);
	
	driver.switchTo().frame("iframeResult");
	
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(2000);
	
	
	Alert q = driver.switchTo().alert();
	//Thread.sleep(2000);
	

	
	q.dismiss();    //to click on cancel button
	
	
	
	
	
	
	
	
	
	
	
}
}
