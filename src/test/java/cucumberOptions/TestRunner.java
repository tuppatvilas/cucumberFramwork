package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		features = "src//test//java//features"
		,glue = "stepDefinitions"
		,monochrome=true
//		,dryRun = true
		,plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
}
