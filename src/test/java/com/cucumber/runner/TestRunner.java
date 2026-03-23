package com.cucumber.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")        // points to src/test/resources/features
@ConfigurationParameter(
    key = PLUGIN_PROPERTY_NAME,
    value = "pretty, html:target/cucumber-reports/report.html"
)
@ConfigurationParameter(
    key = GLUE_PROPERTY_NAME,
    value = "com.cucumber.steps"            // tells Cucumber where step definitions live
)
public class TestRunner {
    // Empty — annotations do all the work
}