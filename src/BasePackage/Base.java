package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base 
{
	protected WebDriver driver;
	public void LaunchBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rohit_UPSC\\New\\Selenium\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		driver = new ChromeDriver(opt);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
