package parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private WebDriver driver;
    private static DriverFactory instance = new DriverFactory();
    ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>() {
        @Override
        protected WebDriver initialValue() {
            if (driver == null) {
                WebDriverManager.chromedriver().cachePath(System.getProperty("user.dir") + "/src/test/resources/drivers").setup();
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("--headless");
                driver = new ChromeDriver(options);
            }
            return driver;
        }
    };

    private DriverFactory() {
        //Do-nothing..Do not allow to initialize this class from outside
    }

    public static DriverFactory getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public void removeDriver() {
        threadLocalDriver.get().quit();
        threadLocalDriver.remove();
    }

}
