package com.tdc.smoke;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
format={"pretty","html:reports/test-report"}, 
features="src/test/resources",
tags= "@sql")
public class GoogleLoginSQLRunnerTest {

}
