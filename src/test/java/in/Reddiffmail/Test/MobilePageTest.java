package in.Reddiffmail.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.MobilesPage;
import in.Rediffmail.BasePage.BasePage;

public class MobilePageTest extends BasePage
{
	
	HomePage homepage;
	MobilesPage mobilepage;
	public MobilePageTest() throws Exception 
	{
		super();
		
	}
	
	@BeforeMethod
	public void Start() throws Exception
	{
		Initilization();
		
		mobilepage=new MobilesPage();
		homepage=new HomePage();
		mobilepage=homepage.Mobiles_Link();
		
	}
	
	@Test(priority=1)
	public void validatelogo() throws Exception
	{	
		mobilepage=new MobilesPage();
		boolean flag1=mobilepage.verifyLogorediff();
		System.out.println(flag1);
	}
	
	@Test(priority=2)
	public void verifyUrl()
	{
		String url=mobilepage.url();
		System.out.println(url);
	}
	
	@Test(priority=3)
	public void verifyTitle()
	{
		String title=mobilepage.title();
		System.out.println(title);
		
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	

}
