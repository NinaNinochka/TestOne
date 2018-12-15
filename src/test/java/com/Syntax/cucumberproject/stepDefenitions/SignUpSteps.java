package com.Syntax.cucumberproject.stepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestUtils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps  extends BaseClass {
	
	
	@Given("^I click on signUp$")
	public void i_click_on_signUp() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@Given("^I choose freeCRM$")
	public void i_choose_freeCRM() throws Throwable {
		Thread.sleep(2000);
		 WebElement dd = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
         Select obj=new Select(dd);
         obj.selectByVisibleText("Free Edition");
        }

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and_and_and_and_and(String fName, String lName, String email, String confEmail, String userName, String pwd,String confPwd) throws Throwable {
	        driver.findElement(By.name("first_name")).sendKeys(fName);
		    driver.findElement(By.name("surname")).sendKeys(lName);
		    driver.findElement(By.name("email")).sendKeys(email);
		    driver.findElement(By.name("email_confirm")).sendKeys(confEmail);
		    driver.findElement(By.name("username")).sendKeys(userName);
		    driver.findElement(By.name("password")).sendKeys(pwd);
		    Thread.sleep(1000);
		    driver.findElement(By.name("passwordconfirm")).sendKeys(confPwd);
		
		
	}

	@When("^I check conditions and click submit$")
	public void i_check_conditions_and_click_submit() throws Throwable {
		 WebElement CheckBox = driver.findElement(By.name("agreeTerms"));
		  CheckBox.click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("submitButton")).click();
	}

	@Then("^i enter company info \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_company_info_and(String companyName, String companyNumber) throws Throwable {
		Thread.sleep(2000);
		 driver.findElement(By.id("company_name")).sendKeys(companyName);
		    driver.findElement(By.id("phone")).sendKeys(companyNumber);
				
	}

	@Then("^I click on continuee$")
	public void i_click_on_continue() throws Throwable {
		 driver.findElement(By.name("btnSubmit")).click();
	}

	@Then("^I cklick on Complite Registration$")
	public void i_cklick_on_Complite_Registration() throws Throwable {
		 driver.findElement(By.name("finish")).click();
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    driver.quit();
	}

}
