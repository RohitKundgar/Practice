package SeleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rohit_UPSC\\New\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13 pro max");
		
	
	}

}
