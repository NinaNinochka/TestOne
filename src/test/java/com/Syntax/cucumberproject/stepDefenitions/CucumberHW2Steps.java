package com.Syntax.cucumberproject.stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberHW2Steps {
	
	WebDriver driver;
	
	@Given("^I open browser1$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I navigate to FreeCRM$")
	public void i_navigate_to_FreeCRM() throws Throwable {
	    String url="https://www.freecrm.com/index.html";
	    driver.get(url);
	}

	@When("^I  click on Sign up$")
	public void i_click_on_Sign_up() throws Throwable {
		Thread.sleep(2000);
	  driver.findElement(By.linkText("Sign Up")).click();
	}

	@When("^I click on drop down select$")
	public void i_click_on_drop_down_select() throws Throwable {
            WebElement dd = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
            Select obj=new Select(dd);
            obj.selectByVisibleText("Free Edition");
            
            
	}

	@When("^I enter user information \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"  and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_user_information_and_and_and_and_and_and(String fName, String lName, String email, String email2, String uName, String pwd, String pwd2) throws Throwable {
	    driver.findElement(By.name("first_name")).sendKeys(fName);
	    driver.findElement(By.name("surname")).sendKeys(lName);
	    driver.findElement(By.name("email")).sendKeys(email);
	    driver.findElement(By.name("email_confirm")).sendKeys(email2);
	    driver.findElement(By.name("username")).sendKeys(uName);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	    driver.findElement(By.name("passwordconfirm")).sendKeys(pwd2);
	       
	}

	@When("^I click on check box$")
	public void i_click_on_check_box() throws Throwable {
	  WebElement CheckBox = driver.findElement(By.name("agreeTerms"));
	  CheckBox.click();
	  
	  
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
	    driver.findElement(By.id("submitButton")).click();
	}

	@When("^I fill company info \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_fill_company_info_and(String Name, String phone) throws Throwable {
	    driver.findElement(By.id("company_name")).sendKeys(Name);
	    driver.findElement(By.id("phone")).sendKeys(phone);
			
	}
	@When("^I click on continue$")
	public void i_click_on_continue() throws Throwable {
	   driver.findElement(By.name("btnSubmit")).click();
	}

@Then("^I complite registration$")
public void i_complite_registration() throws Throwable {
    driver.findElement(By.name("finish")).click();
}}