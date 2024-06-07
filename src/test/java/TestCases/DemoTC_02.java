package TestCases;

import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import POM.WelcomePage;

public class DemoTC_02 extends BaseClass {
	
	@Test
	public void ClickOnDesktopsLink() {
		WelcomePage w = new WelcomePage(driver);
		w.getComputersLink().click();
		w.getDesktopsLink().click();
		
	}

}
