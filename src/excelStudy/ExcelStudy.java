package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile= new FileInputStream("E:\\Rohit_UPSC\\Book1.xlsx");
		Sheet BookSheet1 = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String row1Value = BookSheet1.getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(row1Value);
		
		WorkbookFactory.create(myFile).getSheet("Sheet1");
		
	}

}
