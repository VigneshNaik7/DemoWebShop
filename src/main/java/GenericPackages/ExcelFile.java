package GenericPackages;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFile implements FrameWorkConstant  {
	
	public String ToReadDataFromExcel(String Sheet1,int row ,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excel);
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(Sheet1).getRow(row).getCell(cell).toString();
		
		return value;
				
	}
//	public static void main(String[] argu) throws EncryptedDocumentException, IOException {
//		ExcelFile e = new ExcelFile();
//		System.out.println(e.ToReadDataFromExcel("Sheet1", 2, 0));
//	}
	
}
