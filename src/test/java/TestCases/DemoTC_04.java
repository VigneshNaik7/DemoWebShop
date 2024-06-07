package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import GenericPackages.ExcelFile;
import POM.LoginPage;
import POM.PasswordRecoveryPage;
import POM.WelcomePage;

public class DemoTC_04 extends BaseClass {
	
	@Test
	
	public void PasswordRecovery() throws EncryptedDocumentException, IOException {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();
		
		LoginPage l  = new LoginPage(driver);
		l.getForgotPasswordLink().click();
		
		ExcelFile e = new ExcelFile();
		
		PasswordRecoveryPage p = new PasswordRecoveryPage(driver);
		p.getPasswordRecoveryLink().sendKeys(e.ToReadDataFromExcel("Sheet1", 2, 0));
		p.getRecoveryButton().click();
	}

}
