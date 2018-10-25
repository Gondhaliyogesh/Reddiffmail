package in.Reddiffmail.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.HomeandDecorePage;
import in.Rediffmail.BasePage.BasePage;

public class HomeandDecorepageTest extends BasePage 
{
	HomePage homepage;
	HomeandDecorePage hdpage;

	public HomeandDecorepageTest() throws Exception 
	{
		super();
		
	}
	
	@BeforeMethod
	public void start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		hdpage=homepage.HomeDecore_link();
		hdpage=new HomeandDecorePage();
		
	}
	
	@Test
	public void verifyTitle()
	{
		String title=hdpage.verifytitle();
		System.out.println(title);
		Assert.assertEquals(title, "Buy Home Decoration & Furnishing Online: Bathroom Fitting, Bar Furnishing | Rediff Shopping");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
