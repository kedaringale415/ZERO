package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static String fetchdata(String sheetname,int a,int b) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\rewat\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\FB DATA.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(a).getCell(b).getStringCellValue();
		return value;
	}

}
