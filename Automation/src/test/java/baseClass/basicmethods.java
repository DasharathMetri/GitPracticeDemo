package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class basicmethods {
	public WebDriver driver;
	public void openBrowser(String Browser, String url)
	{
		if(Browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get(url);
		}
		else if(Browser.equalsIgnoreCase("IE"))
		{
			 driver= new InternetExplorerDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get(url);
		}
		
	}
		
	

}
