package com.Syntax.cucumberproject.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"src\\test\\resources\\Features"},
glue= "",
monochrome=true,  // monochrome specify TRUE , so it'll show code lines in nice waygg
plugin= {"pretty","html:test-output"},// Pretty - shows steps that run.if folder not there , it'll create a folder
dryRun=true)
public class LoginRunner {

}
