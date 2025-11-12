package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	protected WebDriver driver;
	
	//Constructor
	public loginPage(WebDriver driver)
	{
		this.driver= driver;
		
		if(!driver.getTitle().equals("practicetestautomation"))
		{
			throw new IllegalStateException("This is not login page. The current page is: "+driver.getCurrentUrl());
		}
	}
	
	//Identifiers/Locators
	private By txt_username= By.xpath("//input[@name=\\\"username\\\"]");
	private By txt_password= By.xpath("//input[@name=\\\"password\\\"]");
	private By btn_submit = By.id("submit");
	private By btn_logout = By.xpath("//a[text()='Log out']");
	
	
	//Methods
	public void entrUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void entrPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit).click();
	}
	
	public void CheckLogoutIsDisplayed()
	{
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginValidUser(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_submit).click();
		driver.findElement(btn_logout).click();
	}
	

}
