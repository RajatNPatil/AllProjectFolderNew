package Practice01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksPrinting {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
		
		for(int i=0; i<links.size(); i++)
		{
			String Linktext=links.get(i).getText();
			System.out.println("Google lang links: "+Linktext);
		}
				

	}

}
