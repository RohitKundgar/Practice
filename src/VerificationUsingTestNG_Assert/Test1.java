package VerificationUsingTestNG_Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Rohit_UPSC\\New\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkBox1.click();
		if (checkBox1.isSelected()) 
		{
			Reporter.log("TC is failed", true);
			
		}
		else
		{
			Reporter.log("TC is Passed", true);

		}
		driver.close();
  }
}
