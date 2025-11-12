package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.loginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps_PF {
	
	WebDriver driver=null;
	loginPage_PF login;
	HomePage_PF home;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("=== I am iside this LoginDemoSteps_PF class ===");
		
		System.out.println("Inside step- browser is open");
	    
	    String projectPath= System.getProperty("user.dir");
	    System.out.println("Project path is: "+projectPath);
	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    
	    driver= new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    
	    //driver.manage().window().maximize();
	}

	@And ("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		
		Thread.sleep(3000);
   
	}

	@When("^user enters (.*) and (.*)$")        //.* = means anything
	public void user_enters_username_and_password(String username, String password) {
		
		login = new loginPage_PF(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
	    
	}
	
	@And("user clicks on login page")
	public void user_clicks_on_login_page() throws InterruptedException {
		
		login.clickLogin();
		
		Thread.sleep(3000);
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		
		home = new HomePage_PF(driver);
		
		home.checkLogoutIsDisplayed();
				
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	   
	}

}
