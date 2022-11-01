package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.DriverManager;
import org.junit.Rule;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    public static WebDriver driver;

    // Start driver
    @Before
    public static void setup() {
        if (driver == null) {
            driver = DriverManager.getDriver();
        }
    }

    // Take screenshot //
/*    @AfterStep
    public static void takeScreenshot(Scenario scenario) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
    }*/

    // Take screenshot if step fails //
    @AfterStep
    public static void takeScreenshotIfStepFails(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }

    // Quit driver
    @After
    public static void tearDown() {
        if (driver == null) {
            return;
        }
        driver.quit();
        driver = null;
    }
}
