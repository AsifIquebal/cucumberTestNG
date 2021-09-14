package parallel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumber-report/report.html",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true,
        glue = {"parallel"},
        features = {"src/test/resources/parallel/scenario-outlines-web.feature"}
)
public class CukeTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
