package in.Reddiffmail.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.Reddiffmail.Pages.HealthandFitnessPage;
import in.Reddiffmail.Pages.HomePage;
import in.Rediffmail.BasePage.BasePage;

public class HealthandFitnesspageTest  extends BasePage
{
	HomePage homepage;
	HealthandFitnessPage hfpage;

	public HealthandFitnesspageTest() throws Exception 
	{
		super();
		
	}
	
	@BeforeMethod
	public void start() throws Exception
	{
		Initilization();
		homepage=new HomePage();
		hfpage=homepage.HealthandFitness_link();
		
	}
	@Test
	public void verifytitle()
	{
		String title=hfpage.verifyTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Buy Health and Fitness Equipments online - Rediff Shopping");
	}
	

}
