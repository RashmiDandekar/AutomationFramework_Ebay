package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
	features = {"Features/Buy.feature","Features/Sell.feature", "Features/ContinueWithGoogle.feature", "Features/Dailydeals.feature", "Features/HelpAndContact.feature"}
	,glue={"StepDefinition"}
<<<<<<< HEAD
	,plugin= {"html:HTML_report/tag1signin","json: JSON_report/tag1signin", "junit: Junit_report/tag1signin"}
	,tags={"@tag1"}
	)
=======
	,plugin= {"html:HTML_report/html_report","json: JSON_report/json_report", "junit: Junit_report/junit_report"}
	
			)
>>>>>>> branch 'master' of https://github.com/rashmidan/Sprint2
	public class TestRunner {
		
	}

