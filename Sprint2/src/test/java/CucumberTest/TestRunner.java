package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "Features/HelpAndContact.feature"
	,glue={"StepDefinition"}
	)
	public class TestRunner {
		
	}

