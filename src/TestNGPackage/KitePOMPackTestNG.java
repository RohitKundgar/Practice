package TestNGPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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


public class KitePOMPackTestNG extends Base
{
	String Excelsheetpath = "E:\\Rohit_UPSC\\zerodhaTesting.xlsx";
	String sheetFromExcel="Sheet1";
	String RealUserId;
	KiteLoginPOM loginObject;
	PinPOMKite pinObject;
	HomePOMKite homeObject;
	
	@BeforeClass
public void launchBrowser()
{
	LaunchBrowser("https://kite.zerodha.com/");
	
	Reporter.log("Launching Browser...",true);
	
	loginObject = new KiteLoginPOM(driver);
	pinObject = new PinPOMKite(driver);
	homeObject = new HomePOMKite(driver);
}

	@BeforeMethod
public void enterUserDetails() throws EncryptedDocumentException, IOException
{
		
		RealUserId = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 0);
		String RealPaswd = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 1);
		String RealPin = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 2);
		String UserIdErrorMsg = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 3);
		String PaswdErrorMsg = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 4);

		loginObject.enterUserId(RealUserId);
		
		//loginObject.enterPassword(RealPaswd);
		loginObject.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		pinObject.enterPin(RealPin);
		pinObject.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
}
	

	@Test
  public void validateUserID()  
  {
	  homeObject.validateUserId(RealUserId);
	  
  }
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		homeObject.logoutCode();
	}
	
	@AfterClass
	public void ExitApp()
	{
		closeBrowser();
	}
}
