package VerificationUsingTestNG_Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FalseAssert 
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
		Assert.assertTrue(checkBox1.isSelected(), "CheckBox is not selected");
		driver.close();
  }
  
}
