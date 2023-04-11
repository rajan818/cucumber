package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/skybackground.feature",
		glue="stepsDefinations",
		tags="",
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/report/cucumber.html",
				"json:target/report/cucumber.json"
				
		}
		)

public class TestRunner {
	
	

}
