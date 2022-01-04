package pages;

import org.openqa.selenium.WebDriver;
import baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{
	
	
	
	@FindBy(id = "email")
	public static WebElement username; 
	
	@FindBy (id = "pass")
	public static WebElement password;
	
	@FindBy (name = "login")
	public static WebElement loginButton;
	
	//@FindBy (xpath= "The email or mobile number you entered isn’t connected to an account. ")
	//public static WebElement userNameError;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  String checkTitle() {
		String title = driver.getTitle();
		return title;
	}
	public  void enterCredentials(String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
//	public String wrongUsernameError() {
//		String actualError = userNameError.getText();
//		//String ExpectedUserNameError = "The email or mobile number you entered isn’t connected to an account. ";
//		return actualError;

	
	
}