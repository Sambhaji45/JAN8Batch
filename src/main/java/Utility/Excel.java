package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getTestdata(int row, int cell , String name) throws EncryptedDocumentException, IOException {
		FileInputStream  file = new FileInputStream("E:\\Sambhaji\\SS\\KiteZerodha\\src\\test\\resources\\TestData.xlsx");  
		String value=WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		//System.out.println(value);
		return value;
	}
}
