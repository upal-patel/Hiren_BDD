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


public class StepDefinition2 extends BaseTest {
	LoginPage lp ;
	@After
	public void closeBrowser() {
		System.out.println("Step 2222222222222222222222close");
		driver.close();
		
	}
	
	
	
	

@Given("User is on Login Page.")
public void user_is_already_on_login_page() {
	
	
	lp = new LoginPage();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		System.out.println(driver.getTitle());
    
}





@Then("user enters {string} and {string}.")
public void user_enters_and(String username, String password) {
	lp.enterCredentials(username, password);
   
}
@Then("User clicks on Login Button.")
public void user_clicks_on_login_button() {
	lp.clickLoginButton();
   
}
@Then("verify Assert.")
public void verify_assert() {
	System.out.println("step definition 2 assert");
   
}


}
