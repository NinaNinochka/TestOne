package com.Syntax.cucumberproject.stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	WebDriver driver;

	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^I navihate to the FreeCrm$")
	public void i_navihate_to_the_FreeCrm() throws Throwable {
		driver.get("https://www.freecrm.com/index.html");
	}


	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String uNmae, String pwd) throws Throwable {
	    driver.findElement(By.name("username")).sendKeys(uNmae);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
          driver.switchTo().frame(1);
      	Thread.sleep(2000);
		boolean verify = driver
				.findElement(By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=campaign']"))
				.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(verify);
		System.out.println("Home is displayed" + verify);

	}

	@Then("^I should see an error text$")
	public void i_should_see_an_error_text() throws Throwable {

	}

	@Then ("^I unsuccessfully logged in$")
	public void i_unsuccessfully_logged_in() throws Throwable {

	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		driver.quit();
	}

}