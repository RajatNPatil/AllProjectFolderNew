package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
	WebDriver driver= null;
	
	@Before(value="@smoke", order=1)
	public void browserSetup()
	{
		System.out.println("I am inside the browser setup");
		System.getProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@Before(order=0)
	public void browserSetup2()
	{
		System.out.println("I am inside the browser setup2");
		
	}
	
	@After
	public void teardown()
	{
		System.out.println("I am inside teardown");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeSteps()
	{
		System.out.println("I am inside the before steps");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println("I am inside the after steps");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}
	

}
