package Openbrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox
{
public static void main(String[] args) throws InterruptedException {
	
	
	
System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("file:///E:/html/sample6_multiplecountry.html");
	
	
	//	Thread.sleep(1000);
		
		
		WebElement multi = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(multi);
		
//		s.selectByIndex(0);
//		
//		s.selectByVisibleText("UK");
//		s.selectByVisibleText("NEPAL");
//		
//		List<WebElement> q1 = s.getAllSelectedOptions();
//		
//		
//		for(WebElement f:q1)
//		{
//			
//			System.out.println(f.getText());
//		}
//		
//		System.out.println("...................get All...................");
		
		int w = s.getOptions().size();
		System.out.println(w);
//		syso
//		for(WebElement t1:w)
//		
//		{
//			System.out.println(t1.getText());
//		}
//	
//	
}
}
