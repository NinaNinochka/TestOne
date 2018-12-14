package com.Syntax.cucumberproject.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"src\\test\\resources\\Features"},
glue= {"src\\test\\java\\com\\Syntax\\cucumberproject\\Runners"},
monochrome=true,  // monochrome specify TRUE , so it'll show code lines in nice way. 
plugin= {"pretty","html:test-output"},// Pretty - shows console output. HTML if folder not there , it'll create a folder
dryRun=true)// will show what lines of code missed
public class LoginRunner {

}
