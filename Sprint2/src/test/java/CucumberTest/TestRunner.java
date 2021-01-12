package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
	features = {"Features/Buy.feature","Features/Sell.feature", "Features/ContinueWithGoogle.feature", "Features/Dailydeals.feature", "Features/HelpAndContact.feature"}
	,glue={"StepDefinition"}
	,plugin= {"html:HTML_report/html_report","json: JSON_report/json_report", "junit: Junit_report/junit_report"}
	
			)
	public class TestRunner {
		
	}

