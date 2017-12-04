package selenium.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"selenium.cucumber.stepDefinition"})
public class Testrunner {

}
