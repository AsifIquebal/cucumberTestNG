package parallel;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.util.Arrays;
import java.util.Properties;

public class Hooks {
    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties properties;

    @Before(value = "@browser", order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        properties = configReader.getProperties();
    }

    @Before(value = "@browser", order = 1)
    public void launchBrowser() {
        String browserName = properties.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.initDriver(browserName);
    }

    @After(value = "@browser", order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            //System.out.println(Arrays.toString(sourcePath));
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }

    @After(value = "@browser", order = 0)
    public void quitBrowser() {
        driver.quit();
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("this is before step hook");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("this is after step hook");
    }
}
