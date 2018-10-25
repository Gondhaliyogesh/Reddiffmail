package in.Reddiffmail.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HomePage;
import in.Reddiffmail.Pages.Mens_LifestylePage;
import in.Rediffmail.BasePage.BasePage;

public class MensLifestylepageTest extends BasePage
{
	Mens_LifestylePage MLP;
	HomePage homepage;
	public MensLifestylepageTest() throws Exception
	{
		super();
	}
	
	@BeforeMethod
	public void Start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		MLP=homepage.Mens_Lifestyle_Link();
		MLP=new Mens_LifestylePage();
	}
	
	@Test
	public void validateTitle()
	{
		String title=MLP.verifyTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Buy mens wear online: Jackets, Shorts, Jeans, Casual & Formal Shirts, Trousers | Rediff Shopping");
	}

}
