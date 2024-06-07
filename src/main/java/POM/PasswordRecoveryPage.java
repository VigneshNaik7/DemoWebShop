package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {
	
	public PasswordRecoveryPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy(id = "Email")
	private WebElement PasswordRecoveryLink;
	
	@FindBy(name = "send-email")
	private WebElement RecoveryButton;

	public WebElement getPasswordRecoveryLink() {
		return PasswordRecoveryLink;
	}

	public WebElement getRecoveryButton() {
		return RecoveryButton;
	}

}
