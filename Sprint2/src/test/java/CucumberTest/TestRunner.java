package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "feature"
	,glue={"StepDefinition"}
	,monochrome= true
	,plugin= {"html:HTML_report","json: JSON_report", "junit: Junit_report"}
	)
	public class TestRunner {
		
	}

