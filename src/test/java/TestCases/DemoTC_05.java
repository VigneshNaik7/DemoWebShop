package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import GenericPackages.RegisterExcelFile;
import POM.RegisterPage;
import POM.WelcomePage;

public class DemoTC_05 extends BaseClass {
	
	@Test
	public void ToRegister() throws EncryptedDocumentException, IOException {
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterLink().click();
		
		RegisterPage r = new RegisterPage(driver);
		RegisterExcelFile e = new RegisterExcelFile();
		
		r.getFemaleRadioButton().click();
		r.getFirstNameTextField().sendKeys(e.ToReadDataFromRegisterExcel("register_sheet", 2, 1));
		r.getLastNameTextField().sendKeys(e.ToReadDataFromRegisterExcel("register_sheet", 2, 2));
		r.getEmailTextField().sendKeys(e.ToReadDataFromRegisterExcel("register_sheet", 2, 3));
		r.getPasswordTextField().sendKeys(e.ToReadDataFromRegisterExcel("register_sheet", 2, 4));
		r.getConfirmPasswordTextField().sendKeys(e.ToReadDataFromRegisterExcel("register_sheet", 2, 5));
		r.getRegisterButtonfield().click();
		
		
		
	}

}
