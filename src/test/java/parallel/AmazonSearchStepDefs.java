package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AmazonSearchStepDefs {

    @Given("Step from {string} in {string} feature file")
    public void step(String scenario, String file) {
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario, file);
    }

    @Given("User open browser and  navigates to {string}")
    public void userOpenBrowserAndNavigatesTo(String arg0) {
        DriverFactory.getInstance().getDriver().get(arg0);
    }

    @Then("User searches for {string}")
    public void userSearchesFor(String arg0) {
        DriverFactory
                .getInstance()
                .getDriver()
                .findElement(By.id("twotabsearchtextbox"))
                .sendKeys(arg0 + Keys.ENTER);
    }

    @Then("User closes browser")
    public void userClosesBrowser() {
        DriverFactory.getInstance().removeDriver();
    }

}
