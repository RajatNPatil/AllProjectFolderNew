package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginPage_PF {
	
		WebDriver driver;
		
		public loginPage_PF(WebDriver driver)
		{
			this.driver=driver;
			//PageFactory.initElements(driver, this);
			
			AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver, 30); 
			PageFactory.initElements(factory, this);
		}
		
		@FindBy(partialLinkText="raghav") List<WebElement> myLinks;
		
		@FindBy (how= How.ID, using ="name") WebElement abc;
		
	
	@FindBy(xpath="//input[@name=\\\\\\\"username\\\\\\\"]") @CacheLookup WebElement txtUsername;    // CacheLookup: store the element in the memory to reuse it again in the future
	@FindBy(xpath= "//input[@name=\\\\\\\"password\\\\\\\"]") WebElement txtPassword;
	@FindBy(id="submit") WebElement btnSubmit;
	
	
	public void enterUsername(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		txtPassword.click();
	}
	
	

}
