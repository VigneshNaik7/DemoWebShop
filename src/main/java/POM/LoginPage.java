package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(id = "Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Password")
	private WebElement PasswordTextField;

	@FindBy(id = "RememberMe")
	private WebElement RememberMeTextField;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Log in']")
	
	private WebElement LoginTextField;
	
	
	
	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getRememberMeTextField() {
		return RememberMeTextField;
	}

	public WebElement getLoginTextField() {
		return LoginTextField;
	}

	@FindBy(linkText = "Forgot password?")
	private WebElement ForgotPasswordLink;
	
	@FindBy(xpath = "//input[@type='button' and @value='Register']")
	private WebElement RegisterButton;

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	
	

	public WebElement getForgotPasswordLink() {
		return ForgotPasswordLink;
	}

	
	}

