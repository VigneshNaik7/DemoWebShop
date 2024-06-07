package GenericPackages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RegisterExcelFile implements FrameWorkConstant  {
	
	public String ToReadDataFromRegisterExcel(String Rsheet,int row , int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(RegisterExcel);
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet(Rsheet).getRow(row).getCell(cell).toString();
		return data;
		
	}

}
