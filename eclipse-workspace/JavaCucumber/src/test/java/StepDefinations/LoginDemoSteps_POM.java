package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginDemoSteps_POM {
	
//	WebDriver driver=null;
//	loginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//		System.out.println("=== I am Inside LoginDemoSteps_POM ===");
//		
//		System.out.println("Inside step- browser is open");
//	    
//	    String projectPath= System.getProperty("user.dir");
//	    System.out.println("Project path is: "+projectPath);
//	    
//	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//	    
//	    driver= new ChromeDriver();
//	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	    
//	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//	    
//	    //driver.manage().window().maximize();
//	}
//
//	@And ("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//				
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//		
//		Thread.sleep(3000);
//   
//	}
//
//	@When("^user enters (.*) and (.*)$")        //.* = means anything
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		
//		login= new loginPage(driver); 
//		login.entrUsername(username);
//		login.entrPassword(password);
//		
//		
////		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("username");
////		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("password");
//		
//		Thread.sleep(3000);
//	    
//	}
//	
//	@And("user clicks on login page")
//	public void user_clicks_on_login_page() {
//		
//		login.clickSubmit();
//		//driver.findElement(By.id("submit")).click();
//    
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		
//		login.CheckLogoutIsDisplayed();	
//		//driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed();
//		
//		Thread.sleep(3000);
//		
//		driver.close();
//		driver.quit();
//	   
//	}

}
