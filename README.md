# Test automation example in Java using Selenium, Cucumber and JUnit

This is an example project exploring UI automation testing using Selenium WebDriver, Cucumber (BDD) and JUnit.

## Project structure

* Features and scenarios are described in cucumber feature files using Gherkin language and can be found in a location: /src/test/resources/features/
* Step definitions for each scenario can be found in Stepdefs java file in a location: /src/test/java/stepdefinitions/
* WebDriver setup can be found in DriverManager java file in a location: /src/test/java/managers/
* @Before, @AfterStep and @After methods are set up in a Hooks java file: /src/test/java/stepdefinitions/

## Running the tests

For **running the tests**, use RunCucumberTests java file: (/src/test/java/testrunner/)

Use @tags to select certain features for testing, that are used in cucumber feature files, and change them accordingly in RunCucumberTests java file.

## Reports

After each time tests are run, reports are generated at: 
1. Cucumber built-in report: "/target/cucumber-reports.html" 
2. Extent-reports: "/target/extent-reports/reports[date]/test-output/"

@AfterStep has been set up in a way that screenshot will be taken in case a step fails, which will be embedded in the report.