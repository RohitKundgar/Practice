package kiteUsingProperties;

import java.io.IOException;
import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.Base;
import KitePOMPackage.HomePOMKite;
import KitePOMPackage.KiteLoginPOM;
import KitePOMPackage.PinPOMKite;
import UtilityPackage.Utility;

public class KiteUsingProperties extends Base
{
	String UserIDFromProperties;
	KiteLoginPOM login;
	HomePOMKite home;
	PinPOMKite pin;
@BeforeClass
public void LaunchingBrowser() throws IOException
{
	Reporter.log("Launching Browser, Please Wait", true);
	LaunchBrowser(Utility.getDataFromProperties("URL"));
	Reporter.log("Browser Launched Successfully", true);
	Reporter.log("Initialising POM classes", true);
	
	login = new KiteLoginPOM(driver);
	home = new HomePOMKite(driver);
	pin = new PinPOMKite(driver);

}
  @BeforeMethod
  public void enterUserDetails() throws IOException 
  { 
	  Reporter.log("Taking User Details from Properties File", true);
	  UserIDFromProperties= Utility.getDataFromProperties("USERID");
	  Reporter.log("Entering UserID", true);
	  login.enterUserId(UserIDFromProperties);
	  Reporter.log("Entering Password", true);
	  login.enterPassword(Utility.getDataFromProperties("PASWD"));
	  
	  login.clickOnLoginButton();
	  Reporter.log("Waiting for LoginButton to sync", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  Reporter.log("Entering PIN", true);
	  pin.enterPin(Utility.getDataFromProperties("PIN"));
	  pin.clickOnContinueButton();
	  Reporter.log("Waiting for ContinueButton to sync", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	  
	  
  }
  @Test
  public void ValidateUser() throws IOException
  {
	  String ssPath="E:\\Rohit_UPSC\\New\\Selenium\\Screenshots";
	  int TID= 915; 
			  
	  Reporter.log("Validating UserID, Please wait", true);
	  home.validateUserId(UserIDFromProperties);
	  Utility.getScreenShot(driver,ssPath , TID);
	  Reporter.log("Validated UserID successfully", true);
	 
  }
  @AfterMethod
  public void Logout() throws InterruptedException
  {
	  Reporter.log("Logging out from Kite", true);
	  home.logoutCode();
	  Reporter.log("Logged out from Kite Successfully", true);
  }
  @AfterClass
  public void closeAndExit()
  {
	Reporter.log("Closing Browser", true);
	closeBrowser();  
	Reporter.log("Closed Browser Successfully", true);
  }
  
  
}
