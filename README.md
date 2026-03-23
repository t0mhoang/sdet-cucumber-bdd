# SDET Cucumber BDD Framework

A Java BDD test framework using Cucumber and Selenium WebDriver.

## What this covers
- Gherkin feature files — Feature, Background, Scenario, Scenario Outline
- Step definitions with @Given, @When, @Then annotations
- Cucumber data tables and parameterization with Examples
- Page Object Model integration with step definitions
- BaseSteps class for WebDriver lifecycle in Cucumber context
- TestRunner with @Suite and @SelectClasspathResource
- HTML report generation

## Tech stack
- Java 17
- Cucumber 7.14.0
- Selenium 4.18.1
- JUnit Platform Suite 1.10.0
- WebDriverManager 5.7.0
- Maven

## How to run
```bash
mvn clean test
```

## Scenarios covered
- Successful login with valid credentials
- Failed login with invalid username
- Failed login with invalid password
- Parameterized login with Scenario Outline and Examples table

## Project structure
```
src/
├── main/java/com/cucumber/
│   └── pages/LoginPage.java
└── test/
    ├── java/com/cucumber/
    │   ├── steps/BaseSteps.java
    │   ├── steps/LoginSteps.java
    │   └── runner/TestRunner.java
    └── resources/features/
        └── login.feature
```