package CucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
features = {"Features/Buy.feature","Features/Sell.feature", "Features/ContinueWithGoogle.feature", "Features/Dailydeals.feature", "Features/HelpAndContact.feature"}
,glue={"StepDefinition"}
)
public class TestRunner1  extends AbstractTestNGCucumberTests{

}
