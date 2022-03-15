package com.jbk.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/com/jbk/features",
		glue="com.jbk.stepdefs",
		dryRun=false,// it is used to compile feature file
		monochrome=true,// this is used for OP
		plugin= {"html:target"}// used for report generation
		)


public class TestsRunner {

}
