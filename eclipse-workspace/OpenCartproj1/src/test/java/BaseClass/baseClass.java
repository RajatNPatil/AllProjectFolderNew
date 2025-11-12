package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {
	
	@BeforeClass
	public void setup()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		
	}

}
