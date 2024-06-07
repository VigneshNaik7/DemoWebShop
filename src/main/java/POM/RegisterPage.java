package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	@FindBy(id = "gender-male")
	private WebElement MaleRadioButton;
	
	@FindBy(id = "gender-female")
	private WebElement FemaleRadioButton;

	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}
	@FindBy(id = "FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id = "LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id = "Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(name = "register-button")
	private WebElement RegisterButtonfield;

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegisterButtonfield() {
		return RegisterButtonfield;
	}
	
}
