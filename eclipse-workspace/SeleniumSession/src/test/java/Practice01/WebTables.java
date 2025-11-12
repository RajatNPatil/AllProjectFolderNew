package Practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts.implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table= driver.findElement(By.xpath("//table[@class=\"table table-striped mt-3\"]/tbody//tr"));
		
		
		
		
		
		
	}

}
