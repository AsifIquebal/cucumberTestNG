package parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public WebDriver initDriver(String browser) {
        System.out.println("browser value is: " + browser);
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver()
                        .cachePath(System.getProperty("user.dir") + "/src/test/resources/drivers")
                        .setup();
                ChromeOptions options = new ChromeOptions();
                threadLocalDriver.set(new ChromeDriver(options));
                break;
            case "firefox":
                WebDriverManager.firefoxdriver()
                        .cachePath(System.getProperty("user.dir") + "/src/test/resources/drivers")
                        .setup();
                threadLocalDriver.set(new FirefoxDriver());
                break;
            default:
                System.out.println("Please pass the correct browser value: " + browser);
                break;
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public void removeDriver() {
        System.out.println("Quit driver.....................");
        threadLocalDriver.get().quit();
        threadLocalDriver.remove();
    }

}
