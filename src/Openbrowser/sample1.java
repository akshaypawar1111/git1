package Openbrowser;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{
public static void main(String[] args) throws InterruptedException {
	
	
	
//	System.setProperty("webdriver.chrome.driver", "E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)");
//	
	System.setProperty("webdriver.chrome.driver",
	
"E:\\OneDrive\\OneDrive\\Desktop\\selenium new folder\\chrome108\\chromedriver_win32 (8)\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	//driver.close();
	
	
//	String title = driver.getTitle();
//	
//	System.out.println(title);
//	
//	
//	String url = driver.getCurrentUrl();
//	
//	System.out.println(url);
//	
//	driver.manage().window().maximize();
	
	

	Dimension d = new Dimension(50, 100);
	driver.manage().window().setSize(d);
	
	Thread.sleep(5000);
	
	Point p = new Point(300, 500);
	driver.manage().window().setPosition(p);
	
}
}
