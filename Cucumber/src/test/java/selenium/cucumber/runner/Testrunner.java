package selenium.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/app.feature",
		glue={"selenium.cucumber.stepDefinition"},
		plugin={"html:target/cucumber-html-report"},
		tags={"@tagTest2"}
		)
public class Testrunner {

}
