package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.definition.JvmReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src\\test\\resources\\FeatureFile\\login1.feature"},
glue= {"com.definition"}, monochrome=true, dryRun= false,
plugin= {"html:C:\\Users\\user\\eclipse-workspace\\cucmberNew\\report",
		"json:C:\\Users\\user\\eclipse-workspace\\cucmberNew\\report\\output.json",
		"rerun:src\\test\\resources\\FeatureFile\\FailedScenario.txt"})
public class RunnerClass {
	@AfterClass
	public static void reportGeneration() {
		JvmReports.generateJvmReport("C:\\Users\\user\\eclipse-workspace\\cucmberNew\\report\\output.json");
	}
	
	

}
