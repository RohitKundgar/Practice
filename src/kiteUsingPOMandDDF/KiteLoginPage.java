package kiteUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
	{
		//Step 1: declaring Variable Private using @FindBy
		@FindBy(id="userid") private WebElement  UserName;
		@FindBy(id="password") private WebElement Password;
		@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
		
		//Step 2: create constructor
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Step 3: create methods
		
		public void enterUsername(String username )
		{
			UserName.sendKeys(username);;
		}

		public void enterPassword(String Pswd)
		{
			Password.sendKeys(Pswd);;
		}
		
		public void clickOnLoginButton() throws InterruptedException
		{
			LoginButton.click();
			Thread.sleep(500);
		}
	}
