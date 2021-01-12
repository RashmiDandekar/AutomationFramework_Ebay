package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "Features/Signingin.feature"
	,glue={"StepDefinition"}
	,plugin= {"html:HTML_report/tag1signin","json: JSON_report/tag1signin", "junit: Junit_report/tag1signin"}
	,tags={"@tag1"}
	)
	public class TestRunner {
		
	}

