package stepDefinition;











import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import baseTest.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class StepDefinition extends BaseTest {
	
	LoginPage lp ;
	
	
		
	
	

	@Before
	public void trial() {
		System.out.println("@Before method is printing");
		
		openBrowser();
		lp = new LoginPage();

		
	}
	@Given("User is on Login Page")
	public void user_is_already_on_login_page() {
		
		
		
		
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		System.out.println(driver.getTitle());
	   
	}


	
	@Then("User enters wrong username {string} and password  {string}")
	public void user__wrong_username_and_password(String wrong_username, String wrong_password) {
		lp.enterCredentials(wrong_username, wrong_password);		
	    
	}
	@Then("User clicks")
	public void user_clickslogin_button() {
		lp.clickLoginButton();
	}
	@Then("verify")
	public void verifyassert() {
		System.out.println("passed");
		}
	}

