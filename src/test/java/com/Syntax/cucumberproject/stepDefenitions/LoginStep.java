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
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	}

	@Given("^I navihate to the FreeCrm$")
	public void i_navihate_to_the_FreeCrm() throws Throwable {
	   driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kilany");
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(" Asmaa456");
      
	}
    
	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		Thread.sleep(3000);
	 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	 }

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
		  
	WebElement verify = driver.findElement(By.xpath("//table/tbody/tr/td[@class='logo_text']"));
	Thread.sleep(2000);
		
		Assert.assertTrue(verify.isDisplayed());
		
		System.out.println("Successfully loged in ");
		Thread.sleep(2000);  
	   
	   
	}
	@When("^I enter  invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("109876543");
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(" 65432");
	      
	}

	@Then("^I unsuccessfully logged in$")
	public void i_unsuccessfully_logged_in() throws Throwable {
	    
	}
}