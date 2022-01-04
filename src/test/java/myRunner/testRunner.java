package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "E:\\Selenium_Workspace\\BDDPractice\\src\\main\\java\\featureFile",
		glue = {"stepDefinition"},
	
		dryRun = false ,
		monochrome = true,
		
		
		plugin = {"pretty","html:target/cucumber.html"}
		
		
		)

public class testRunner {

}
