package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.LoginPage;

public class BaseTest {
	public static WebDriver driver;
	
	public void openBrowser() {
		System.out.println("Parent constructor is running");
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//*********************
		
		
	}
	public void closeBrowser () {
		driver.close();
	}

}
