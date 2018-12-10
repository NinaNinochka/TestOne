package com.Syntax.cucumberproject.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Features\\Login.feature",
glue="")
public class LoginRunner {

}
