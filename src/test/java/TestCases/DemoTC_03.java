package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import GenericPackages.ExcelFile;
import POM.LoginPage;
import POM.WelcomePage;

public class DemoTC_03 extends BaseClass {
	@Test
	
	public void ToLogin() throws EncryptedDocumentException, IOException {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginLink().click();
		LoginPage l = new LoginPage(driver);
		ExcelFile e = new ExcelFile();
		
		l.getEmailTextField().sendKeys(e.ToReadDataFromExcel("Sheet1", 1, 0));
		l.getPasswordTextField().sendKeys(e.ToReadDataFromExcel("Sheet1", 1, 1));
		//l.getRememberMeTextField().click();
		l.getLoginTextField().click();
	}

}
