package in.Reddiffmail.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.LoginPage;
import in.Rediffmail.BasePage.BasePage;

public class LoginTest extends BasePage
{
	LoginPage login;
	HomePage homepage;
	
	public LoginTest() throws Exception
	{
		super();
		
	}
	
	@BeforeMethod
	public void Start() throws Exception
	{
		Initilization();
		
		homepage=new HomePage();
		login=new LoginPage();
		login=homepage.Verifylogin();
	}
	
	@Test
	public void loginrediff() throws Exception
	{	
		login=new LoginPage();
		login.Rlogin("Abc", "Abc");
	}
	
	
	@AfterMethod
	public void End()
	{
		driver.close();
	}

}
