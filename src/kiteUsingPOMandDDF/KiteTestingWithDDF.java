package kiteUsingPOMandDDF;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestingWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rohit_UPSC\\New\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		FileInputStream myFile = new FileInputStream("E:\\Rohit_UPSC\\zerodhaTesting.xlsx");
		Workbook workbk = WorkbookFactory.create(myFile);
		Sheet sheetName = workbk.getSheet("Sheet1");
		String userid = sheetName.getRow(0).getCell(0).getStringCellValue();
		String paswd = sheetName.getRow(0).getCell(1).getStringCellValue();
		String pn = sheetName.getRow(0).getCell(2).getStringCellValue();
		
		KiteLoginPage loginPage = new KiteLoginPage(driver);
		loginPage.enterUsername(userid);
		loginPage.enterPassword(paswd);
		loginPage.clickOnLoginButton();
		
	
		
		KitePinPage pinPage = new KitePinPage(driver);
		pinPage.enterPin(pn);
		pinPage.clickOnContinueButton();
		
		KiteHomePage homePage = new KiteHomePage(driver);
		homePage.validateUserId(userid);
		homePage.exitZeroDha();
		
		driver.close();
		
	}

}
