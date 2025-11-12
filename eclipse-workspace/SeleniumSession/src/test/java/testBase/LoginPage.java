package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends basePage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath= "") WebElement userName;
	@FindBy(xpath= "") WebElement password;
	@FindBy(xpath= "") WebElement login;
	
	public void sendUsername(String email)
	{
		userName.sendKeys(email);
	}
	
	public void sendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clcikLogin()
	{
		login.click();
	}
	
	
	
	
	
	

}
