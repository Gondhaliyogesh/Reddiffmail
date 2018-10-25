package in.Reddiffmail.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.WatchesPage;
import in.Rediffmail.BasePage.BasePage;

public class WatchespageTest extends BasePage 
{

	WatchesPage watchespage;
	HomePage homepage;
	public WatchespageTest() throws Exception
	{
		super();

	}
	
	@BeforeMethod
	public void start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		watchespage=homepage.Watches_link();
		watchespage=new WatchesPage();
		
	}
	
	@Test
	public void VerifyTitle()
	{
		String title=watchespage.verifyTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Buy Watches for Men and Women: Branded Smart Watches, Couple Watches & Unisex Watches");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
