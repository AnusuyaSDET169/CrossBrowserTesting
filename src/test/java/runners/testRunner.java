package runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin= {"pretty", "html:target/cucumber-reports/project.html"},

features={"src/test/resources/features/browser.feature"},glue= "stepDefinition")


public class testRunner extends AbstractTestNGCucumberTests {

	

	
	
}

	
