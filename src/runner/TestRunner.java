package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinition",
		plugin= {"html:reports/cucumber-html-report","json:reports/cucumber.json"}
		)
public class TestRunner {

	//comment
	//test changes
}