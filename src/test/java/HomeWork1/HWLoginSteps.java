package HomeWork1;

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
  
  

public class HWLoginSteps {
	
	 WebDriver driver;
	@Given("^I open browser1$")
	public void i_open_browser() throws Throwable {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ninam\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
	 driver =new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	
	}

	@Given("^I navigate to FreeCRM$")
	public void i_navigate_to_FreeCRM() throws InterruptedException {
		Thread.sleep(2000);
		String  url="https://www.freecrm.com/index.html";
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
	     Select obj= new Select(dd);
	     Thread.sleep(2000);
	     obj.selectByVisibleText("Free Edition");   
	}
	

	@When("^I enter user information$")
	public void i_enter_user_information() throws Throwable {
	  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Nina");
	  driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Mishchenko");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ninamishchenko31@gmail.com");
	  driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("ninamishchenko31@gmail.com");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Nina__");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("odimeg23");
	  driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("odimeg23");

	}

	@When("^I click on check box$")
	public void i_click_on_check_box() throws Throwable {
	 driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
	   driver.findElement(By.xpath("//div[@class='myButton']")).click();
	}

	@When("^I fill company info$")
	public void i_fill_company_info() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Syntax");
	   driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("4109197133");
	}

	@When("^I click on continue$")
	public void i_click_on_continue() throws Throwable {
	  driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
	}

	@Then("^I successfuly create an account$")
	public void i_successfuly_create_an_account() throws Throwable {
	  
	}


	
	
	
}
