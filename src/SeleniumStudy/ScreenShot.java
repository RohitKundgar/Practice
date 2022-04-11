package SeleniumStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rohit_UPSC\\New\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		RandomString str= new RandomString(3);
		File destiFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File sourceFile= new File("D:\\Velocity\\Resume&Naukri\\"+str+".png");
		FileHandler.copy(destiFile, sourceFile);
		driver.close();	
	}
	
}
