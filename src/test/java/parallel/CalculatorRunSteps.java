package parallel;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Calculator;

public class CalculatorRunSteps {
    private int total;
    private Calculator calculator;

    @Before
    private void init() {
        total = -999;
    }

    @Given("I have a calculator")
    public void initializeCalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void testAdd(int num1, int num2) {
        total = calculator.add(num1, num2);
    }

    @Then("the result should be {int}")
    public void validateResult(int result) {
        Assert.assertEquals(total, result, "Test Failed");
    }
}
