package com.Syntax.cucumberproject.stepDefenitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSecondPardtOfHW3Steps {
	 WebDriver driver;
	 
	@Given("^I open my browser$")
	public void i_open_my_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}

	@Given("^Navigate to FreeCRM and click sign in$")
	public void navigate_to_FreeCRM_and_click_sign_in() throws Throwable {
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Sign Up")).click();
	}

	@When("^I provide following details$")
	public void i_provide_following_details(DataTable SignUpDetails) throws InterruptedException {
	   
		List<Map<String, String>> maps = SignUpDetails.asMaps(String.class, String.class);
		
		for (Map<String, String> map : maps) {
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Sign Up")).click();
			
			 WebElement dd = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	         Select obj=new Select(dd);
	         obj.selectByVisibleText(map.get("Edition"));
	         
	         
			  driver.findElement(By.name("first_name")).sendKeys(map.get("FirstName"));
			    driver.findElement(By.name("surname")).sendKeys(map.get("LastName"));
			    driver.findElement(By.name("email")).sendKeys(map.get("Email"));
			    Thread.sleep(2000);
			    driver.findElement(By.name("email_confirm")).sendKeys(map.get("ConfirmEmail"));
			    driver.findElement(By.name("username")).sendKeys(map.get("UserName"));
			    driver.findElement(By.name("password")).sendKeys(map.get("Password"));
			    Thread.sleep(1000);
			    driver.findElement(By.name("passwordconfirm")).sendKeys(map.get("ConfirmPassword"));
		}

	}

	@Then("^I click  agree conditions and submit$")
	public void i_click_agree_conditions_and_submit() throws Throwable {
		 WebElement CheckBox = driver.findElement(By.name("agreeTerms"));
		  CheckBox.click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("submitButton")).click();
	    
	}

	@When("^I on company page I provide folloving details$")
	public void i_on_company_page_I_provide_folloving_details(DataTable companyDetails) throws Throwable {
	
 Map<String, String> Maps = companyDetails.asMap(String.class, String.class);
	
	Thread.sleep(2000);
	 driver.findElement(By.id("company_name")).sendKeys(Maps.get("Company"));
	    driver.findElement(By.id("phone")).sendKeys(Maps.get("Phone")); 
	}

	@Then("^i click continue and complete registration$")
	public void i_click_continue_and_complete_registration() throws Throwable {
		 driver.findElement(By.name("btnSubmit")).click();
		 driver.findElement(By.name("finish")).click();
	}

	@Then("^I close my browser$")
	public void i_close_my_browser() throws Throwable {
	   driver.quit();
	}
}
