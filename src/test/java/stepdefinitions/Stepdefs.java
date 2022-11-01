package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class Stepdefs {

    //// To add pause before any step, use Wait(3); ////
    public static void Wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Method to click element that is outside the viewport //
    // (NOT FOR GENERAL USE though, doesn't simulate real user click - goes straight to element)
    private void clickElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    // Method to scroll element into view //
    public void scrollToElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    WebDriver driver = Hooks.driver;

    @Given("Environment is ready for the test")
    public void environmentIsReadyForTheTest() {
        driver.get("https://www.rik.ee/et");
    }

    @When("User clicks a navigation link E-ÄRIREGISTER")
    public void userClicksANavigationLinkEÄRIREGISTER() {
        WebElement eAriregisterNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[1]/div[3]/div[1]/h2/a"));
        eAriregisterNavLink.click();
        Wait(1);
    }

    @Then("User is navigated to E-ÄRIREGISTER")
    public void userIsNavigatedToEÄRIREGISTER() {
        String eAriregisterNodeTitle = driver.findElement(By.xpath("//*[@id=\"node-article-51\"]/header/h1")).getText();
        Assert.assertEquals("e-äriregister", eAriregisterNodeTitle);
    }

    @Given("User is on RIK home page")
    public void userIsOnRIKHomePage() {
        driver.get("https://www.rik.ee/et");
    }

    @When("User clicks {string} navigation link")
    public void userClicksNavigationLink(String string1) {
        if (Objects.equals(string1, "E-ÄRIREGISTER")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[1]/div[1]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "EUROOPA ÄRIREGISTER")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[1]/div[2]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "E-KINNISTUSRAAMAT")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[1]/div[3]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "E-ARVELDAJA")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[2]/div[1]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "KINNISTUPORTAAL")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[2]/div[2]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "KARISTUSREGISTER")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[2]/div[3]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "E-TOIMIK")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[3]/div[1]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "RIIGI TEATAJA")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[3]/div[2]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "AMETLIKUD TEADAANDED")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[3]/div[3]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);

        } else if (Objects.equals(string1, "MUUD TEENUSED")) {
            WebElement categoryNavLink = driver.findElement(By.xpath("//*[@id=\"block-views-home-block\"]/div/div/div/div/div/div[4]/div[1]/div[1]/h2/a"));
            scrollToElement(categoryNavLink);
            categoryNavLink.click();
            Wait(1);
        }
    }

    @Then("User is navigated to {string} info page")
    public void userIsNavigatedToInfoPage(String string2) {
        if (Objects.equals(string2, "e-äriregister")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-53\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "Euroopa äriregister")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-52\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "e-kinnistusraamat")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-51\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "e-arveldaja")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-409\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "Kinnistuportaal")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-159\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "Karistusregister")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-162\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "E-toimik")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-163\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "Riigi Teataja")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-1326\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "Ametlikud Teadaanded")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-160\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);

        } else if (Objects.equals(string2, "Muud teenused")) {
            String pageTitle = driver.findElement(By.xpath("//*[@id=\"node-article-164\"]/header/h1")).getText();
            Assert.assertEquals(string2, pageTitle);
        }
    }
}
