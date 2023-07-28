package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getElement() {
		return element;
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstnaemTf() {
		return firstnaemTf;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmpasswordTF() {
		return confirmpasswordTF;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	@FindBy(linkText = "Register")
	private WebElement element;

	@FindBy(id = "gender-female")
	private WebElement genderRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstnaemTf;

	@FindBy(id = "LastName")
	private WebElement lastnameTF;

	@FindBy(id = "Email")
	private WebElement emailTF;

	@FindBy(id = "Password")
	private WebElement passwordTF;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordTF;

	@FindBy(id = "register-button")
	private WebElement registerbutton;
}
