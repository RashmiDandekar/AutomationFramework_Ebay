package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

<<<<<<< HEAD
@RunWith(Cucumber.class)
	@CucumberOptions(
	
	features = {"Features/Buy.feature","Features/Sell.feature", "Features/ContinueWithGoogle.feature", "Features/Dailydeals.feature", "Features/HelpAndContact.feature"}
	,glue={"StepDefinition"}

	,plugin= {"html:HTML_report/html_report","json: JSON_report/json_report", "junit: Junit_report/junit_report"}
	
			)

	public class TestRunner {
=======
@RunWith(Cucumber.class)
	@CucumberOptions(
	
	features = {"Features/Buy.feature","Features/Sell.feature", "Features/ContinueWithGoogle.feature", "Features/Dailydeals.feature", "Features/HelpAndContact.feature"}
	,glue={"StepDefinition"}
	,plugin= {"html:HTML_report/html_report","json: JSON_report/json_report", "junit: Junit_report/junit_report"}
			)
public class TestRunner {
>>>>>>> b89b5f74443898f42e1ed14fa5168a36e787a6dc
		
	}

