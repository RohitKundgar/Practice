package TestNGPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
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

public class ValidateLoginErrors extends Base
{
	String Excelsheetpath = "E:\\Rohit_UPSC\\zerodhaTesting.xlsx";
	String sheetFromExcel="Sheet1";
	String RealUserId;
	String PaswdErrorMsg;
	
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
public void enterUserDetails() throws EncryptedDocumentException, IOException, InterruptedException
{
		
		RealUserId = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 0);
		String RealPaswd = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 1);
		String RealPin = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 2);
		String UserIdErrorMsg = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 3);
		PaswdErrorMsg = Utility.readDataFromExcelSheet(Excelsheetpath, sheetFromExcel, 0, 4);

		loginObject.enterUserId(RealUserId);
		
		//loginObject.enterPassword(RealPaswd);
		loginObject.clickOnLoginButton();
		
		
		//pinObject.enterPin(RealPin);
		//pinObject.clickOnContinueButton();
}
	

	@Test
  public void validateLoginErrorMsgs()  
  {
	boolean TCResult = loginObject.ValidatePaswdErrorMsg(PaswdErrorMsg);  
	if(TCResult == true)
	{
	Reporter.log("TC is passed",true );
  }
	else
	{
	Reporter.log("TC failed, Password Error Msgs do not match", true);	
	}
	
}
	
	
	@AfterClass
	public void ExitApp()
	{
		closeBrowser();
	}
}
