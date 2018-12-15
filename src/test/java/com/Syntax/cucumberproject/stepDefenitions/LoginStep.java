package com.Syntax.cucumberproject.stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestUtils.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseClass {



	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^I navigate to FreeCrm$")
	public void i_navigate_to_FreeCrm() throws Throwable { 
		driver.get("https://www.freecrm.com/index.html");
	}}


	
	
	


