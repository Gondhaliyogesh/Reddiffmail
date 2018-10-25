package in.Reddiffmail.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.Womens_LifestylePage;
import in.Rediffmail.BasePage.BasePage;
import junit.framework.Assert;

public class WomensLifestylepageTest extends BasePage
{
	Womens_LifestylePage WLP;
	HomePage homepage;
	public WomensLifestylepageTest() throws Exception 
	{
		super();
		
	}
	
	@BeforeMethod
	public void start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		WLP=homepage.Womens_Lifestyle_Link();
		WLP=new Womens_LifestylePage();
		
	}

	@Test
	public void validateTitle()
	{
		String title=WLP.verifyTitle();
		System.out.println(title);
		Assert.assertEquals(title, "pass");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
