package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty", "html:target/cucumber-report/report.html",
				"rerun:target/failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		},
		monochrome = true,
		glue = {"parallel"},
		features = {"src/test/resources/parallel/"},
		//tags = "@automation_practice"
		tags = "@dt"
		)

public class JUnitCukeTest {

}
