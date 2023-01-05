package Openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p1 {
	
    @Test
	public void facebook() {
		
    	System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");	
    	
    	
    	WebDriver driver= new ChromeDriver();
    	
    	driver.get("https://en-gb.facebook.com/");
		
	}
	
	
	
	
	
	
	
}
