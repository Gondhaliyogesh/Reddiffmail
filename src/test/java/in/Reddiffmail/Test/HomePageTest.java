package in.Reddiffmail.Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.LoginPage;
import in.Reddiffmail.Pages.MobilesPage;
import in.Rediffmail.BasePage.BasePage;

public class HomePageTest extends BasePage
{
	HomePage homepage;
	LoginPage loginPage;
	MobilesPage mobilepage;
	public HomePageTest() throws Exception
	{
		super();
	}
	
	@BeforeMethod
	public void start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		loginPage=new LoginPage();
		mobilepage=new MobilesPage();
		
	}
	@Test(priority=1)
	public void logo()
	{
		boolean	flag=homepage.logo();
		System.out.println(flag);
	}
	
	@Test(priority=3)
	public void validatelogin() throws Exception
	{
		loginPage=homepage.Verifylogin();
	}
	
	@Test(priority=2)
	public void vmobilelink() throws Exception
	{
		mobilepage=homepage.Mobiles_Link();
	}
	
	@AfterMethod
	public void End()
	{
		driver.quit();
	}

}
