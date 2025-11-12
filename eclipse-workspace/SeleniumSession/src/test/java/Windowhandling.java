import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow= driver.getWindowHandle();
		System.out.println("Parent Window: "+parentWindow);
		
		//Opening new window by clicking on link
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
		
		Set<String> multiWindows= driver.getWindowHandles();
		
		for(String MultiWindId: multiWindows)
		{
			System.out.println("Multiple Windows: "+MultiWindId);
		}
		
//		for(int i=1; i<multiWindows.size(); i++)
//		{
//			driver.switchTo().window();
//		}
		
		
		

	}

}
