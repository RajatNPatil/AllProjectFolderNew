package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.time.Duration;

 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo/BackgroundDemo.feature", glue= {"StepsForBackground"},
monochrome=true,
plugin= {"pretty", "json:target/JSONreports/report.json",
		"junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports"})
//tags= "@smoketest")

public class testRunnerForBackgroundDemo {
	
	

}
