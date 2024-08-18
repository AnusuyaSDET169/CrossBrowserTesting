package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/project.html" },

features = { "src/test/resources/features/array.feature" }, glue = { "stepDefinition", "hooks" })

public class testRunner extends AbstractTestNGCucumberTests {

@Override
@DataProvider(parallel = false)
public Object[][] scenarios() {
return super.scenarios();
}


}