package selenium.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/DataDriven.feature",
		glue={"selenium.cucumber.stepDefinition"},
		plugin={"html:target/cucumber-html-report"}
		)
public class DataDriven_Testrunner {

}
