package kiteUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath= "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateUserId(String Uname)
	{
		String actualUserName = userId.getText();
		String  ExpectedUserName= Uname;
		if(ExpectedUserName.equals(actualUserName))
		{
			System.out.println("UserId matches, TC is passed");
		}
		
		else
		{
			System.out.println("UserId doesn't match, TC failed" );
		}
	}
	
	public void exitZeroDha() throws InterruptedException
	{
		userId.click();
		Thread.sleep(1000);
		LogoutButton.click();
	}
}
