package CucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features = "features"
,glue={"StepDefinition"}
,monochrome= true
,plugin= {"html:HTML_report","json: JSON_report", "testng: Junit_report"}
,tags= {"@First"}
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
