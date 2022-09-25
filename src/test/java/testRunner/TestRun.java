package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
             features = "C:\\Users\\Eswar Reddy\\eclipse-workspace\\cucumber_project\\Featurefile",
		     glue = {"stepDefination"}
)
public class TestRun {
	
	
			


}
