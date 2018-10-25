package in.Reddiffmail.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.Personal_CarePage;
import in.Rediffmail.BasePage.BasePage;


public class PersonalcarepageTest extends BasePage
{
	Personal_CarePage pcpage;
	HomePage homepage;

	public PersonalcarepageTest() throws Exception
	{
		super();
		
	}
	
	@BeforeMethod
	public void start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		pcpage=homepage.PersonalCare_Link();
		
	}
	
	
	@Test
	public void verifyTitle()
	{
		String title=pcpage.verifytitle();
		System.out.println(title);
		Assert.assertEquals(title, "Health and Beauty Products - Buy Perfumes, Deodorants, Cosmetics and More");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
