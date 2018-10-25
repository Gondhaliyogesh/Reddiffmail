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
	@Test
	public void logo()
	{
		boolean	flag=homepage.logo();
		System.out.println(flag);
	}
	
	@Test
	public void validatelogin() throws Exception
	{
		loginPage=homepage.Verifylogin();
	}
	
	@Test
	public void vmobilelink() throws Exception
	{
		mobilepage=homepage.Mobiles_Link();
	}
	
	@Test
	public void verifymeslifestyle()
	{
		homepage.Mens_Lifestyle_Link();
		System.out.println("Suceessfully Click on Mens's Lifestyle link");
	}
	
	@Test
	public void verifywomeneslifestyle()
	{
		homepage.Womens_Lifestyle_Link();
		System.out.println("Suceessfully Click on Women's Lifestyle link");
	}
	
	@Test
	public void verifyelectronics()
	{
		homepage.Electronics_Link();
		System.out.println("Suceessfully Click on Electronics link");
	}
	@Test
	public void verifywateches()
	{
		homepage.Watches_link();
		System.out.println("Suceessfully Click on Watches link");
	}
	@Test
	public void verifyhomeanddecore()
	{
		homepage.HomeDecore_link();
		System.out.println("Suceessfully Click on HomeDecore_link ");
	}
	
	@Test
	public void verifypersonalcare()
	{
		homepage.PersonalCare_Link();
		System.out.println("Suceessfully Click on PersonalCare_Link ");
	}
	@Test
	public void verifyhealthandfitness()
	{
		homepage.HealthandFitness_link();
		System.out.println("Suceessfully Click on Health And Fitness");
	}
	
	@Test
	public void verifyBooks()
	{
		homepage.Books_link();
		System.out.println("Suceessfully Click on Books");
	}
	
	@AfterMethod
	public void End()
	{
		driver.quit();
	}

}
