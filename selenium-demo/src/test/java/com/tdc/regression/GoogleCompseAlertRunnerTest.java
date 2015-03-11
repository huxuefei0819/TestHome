package com.tdc.regression;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
format={"pretty","html:reports/test-report"}, 
features="src/test/resources",
tags= "@compose")
public class GoogleCompseAlertRunnerTest {
}
