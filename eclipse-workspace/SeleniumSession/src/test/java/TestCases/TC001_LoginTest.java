package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testBase.LoginPage;

public class TC001_LoginTest {
	
	@Test(dataProvider="UserData", dataProviderClass=DataProvider.class)
	public void verifyLogin(String email, String pwd)
	{
		LoginPage lp= new LoginPage(driver);
		lp.sendUsername(email);
		lp.sendPassword(pwd);
		lp.clcikLogin();
			
	}

}
