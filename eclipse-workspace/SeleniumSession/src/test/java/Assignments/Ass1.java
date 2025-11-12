package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		String title= driver.getTitle();
		title.contains(title);
		
		

	}

}
