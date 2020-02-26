package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"@src\\test\\resources\\FeatureFile\\FailedScenario.txt"},
glue= {"com.definition"}, monochrome=true, dryRun= false,
plugin= {"html:C:\\Users\\user\\eclipse-workspace\\cucmberNew\\report",
		"json:C:\\Users\\user\\eclipse-workspace\\cucmberNew\\report\\output.json"})
public class ReRunnerTest {
	

}
