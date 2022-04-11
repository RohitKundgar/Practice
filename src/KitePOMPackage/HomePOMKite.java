package KitePOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import UtilityPackage.Utility;

public class HomePOMKite 
{
	@FindBy(xpath= "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	public HomePOMKite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserId(String expectedUser)
	{
		String actualUser = userId.getText();
		//String expectedUser = un;
		if(expectedUser.equals(actualUser))
		{
			System.out.println("userid matches, TC passed");
		}
		else
		{
			System.out.println("userids do not match, TC failed");
		}
	}
	
	public void logoutCode() throws InterruptedException
	{
		userId.click();
		Thread.sleep(100);
		LogoutButton.click();
		Thread.sleep(200);
	}
	
}
