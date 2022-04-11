package KitePOMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.Utility;

public class KiteLoginPOM 
{
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath= "//button[@type='submit']") private WebElement LoginButton;
	@FindBy(xpath ="//span[text()='Password should be minimum 6 characters.']") private WebElement PasswdErrorMsg;
	
	public KiteLoginPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserId(String usrid)
	{
		userID.sendKeys(usrid);
		
	}
	
	public void enterPassword(String pswd)
	{
		password.sendKeys(pswd);
		
	}
	
	public boolean ValidatePaswdErrorMsg(String pswdError)
	{
		if(PasswdErrorMsg.isDisplayed())
		{
			
			 return PasswdErrorMsg.getText().equals(pswdError);
		 }
		else 
		{
			return false;	
		}
	}
	

	public void clickOnLoginButton() 
	{
		LoginButton.click();
	}
}
