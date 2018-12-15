package com.Syntax.cucumberproject.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\CucumberSecondPartOfHW3.Feature"}
,glue= {"src\\test\\java\\com\\Syntax\\cucumberproject\\stepDefenitions\\CucumberSecondPardtOfHW3Steps.java"}
,monochrome=true
,plugin= {"pretty","html:test-output"}
,dryRun=true)
public class CucumberSecondPartOfHW3RunnerClass {

}
