package GenericPackages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	 protected WebDriver driver;
	
	@BeforeClass
	public void ToLaunch() {
		driver = new ChromeDriver();
		Reporter.log("Browser is lanuched",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@BeforeMethod
	public void ToNavigate() throws IOException {
		PropertyFile pro = new PropertyFile();
		driver.get(pro.ToReadDataFromPropertyFile("URL")); //URL is nothing but which we passed in property file in TestData "URL:https://demowebshop.tricentis.com/register"
		//driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Application get launched",true);
	}
	
	@AfterMethod
	public void Logout() {
		
	}
	
	@AfterClass
	public void CloseTheBrowser() {
		driver.quit();
		Reporter.log("Browser get quited",true);
	}

}
