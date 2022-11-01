package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {

                // Use Chrome browser //
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

                // Use Safari browser //
        // TO DO! Set up parallel execution of tests in different browsers.
        // Issue with SafariDriver: appears there is no check for pending navigation requests before releasing the click event as complete.
        // Workaround, add Wait(3); after click events.
/*        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;*/
    }
}
