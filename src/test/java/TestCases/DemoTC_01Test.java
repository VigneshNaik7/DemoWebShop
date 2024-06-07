package TestCases;

import org.testng.annotations.Test;

import GenericPackages.BaseClass;
import POM.WelcomePage;

public class DemoTC_01Test extends BaseClass {
	@Test
	
	public void ClickOnRegisterLink() {
		WelcomePage w1 = new WelcomePage(driver);
		w1.getRegisterLink().click();
	}

}
