package Openbrowser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup
{
public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	
	
	

	
	driver.get("https://skpatro.github.io/demo/links/");
	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	
	Set<String> c = driver.getWindowHandles();    //to get child browser id/address as well as the main pg id call function getwindowHandles
	
	ArrayList<String> a=new ArrayList<String>(c);  //to store the set of ids make use of arraylist 
	
	String id = a.get(1);
	
	driver.switchTo().window(id);    //to switch selenium focus from main page to child window use funtion (<--)
	Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();  
	
	Thread.sleep(3000);
	
	driver.switchTo().window( a.get(0));
   
	
	
	
	
	
	
}
}
