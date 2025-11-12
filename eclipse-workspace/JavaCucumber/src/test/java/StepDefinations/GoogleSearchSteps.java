package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
//	
//	WebDriver driver= null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//	    System.out.println("Inside step- browser is open");
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
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside step- user is on google search page");
//		
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside step- user enters a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//		
//		Thread.sleep(3000);
//		
//		
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		System.out.println("Inside step- hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() throws InterruptedException {
//		System.out.println("Inside step- user is navigated to search results");
//		
//		driver.getPageSource().contains("Online Courses");
//		
//		Thread.sleep(3000);
//		
//		driver.close();
//		driver.quit();
//	}

}
