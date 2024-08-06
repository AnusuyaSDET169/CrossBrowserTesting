package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/project.html" },

features = { "src/test/resources/features" }, glue = { "stepDefinition", "hooks" })

public class testRunner extends AbstractTestNGCucumberTests {

@Override
@DataProvider(parallel = true)
public Object[][] scenarios() {
return super.scenarios();
}


}