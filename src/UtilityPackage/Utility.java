package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import BasePackage.Base;
import net.bytebuddy.utility.RandomString;

public class Utility
{
	
	public static String readDataFromExcelSheet(String excelFilePath,String sheetName, int row, int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream(excelFilePath);
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet(sheetName);
		String valueAtCell = mySheet.getRow(row).getCell(column).getStringCellValue();
		return valueAtCell;
	}
	
	public static String getDataFromProperties(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myFile = new FileInputStream("C:\\Users\\Win\\eclipse-workspace\\FirstJava\\src\\KiteUserDetails.properties");
		prop.load(myFile);
		
		return prop.getProperty(key);
		
	}
	public static void getScreenShot(WebDriver driver,String destinationPath, int Tid) throws IOException
	{
		Random rInt= new Random();
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File(destinationPath+Tid+rInt.nextInt(3)+".png");
		FileHandler.copy(sourceFile, destinationFile);
		
		
	}
}
