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
	
	@Test(priority=4)
	public void verifymeslifestyle()
	{
		homepage.Mens_Lifestyle_Link();
		System.out.println("Suceessfully Click on Mens's Lifestyle link");
	}
	
	@Test(priority=5)
	public void verifywomeneslifestyle()
	{
		homepage.Womens_Lifestyle_Link();
		System.out.println("Suceessfully Click on Women's Lifestyle link");
	}
	
	@Test(priority=6)
	public void verifyelectronics()
	{
		homepage.Electronics_Link();
		System.out.println("Suceessfully Click on Electronics link");
	}
	@Test(priority=7)
	public void verifywateches()
	{
		homepage.Watches_link();
		System.out.println("Suceessfully Click on Watches link");
	}
	@Test(priority=8)
	public void verifyhomeanddecore()
	{
		homepage.HomeDecore_link();
		System.out.println("Suceessfully Click on HomeDecore_link ");
	}
	
	@Test(priority=9)
	public void verifypersonalcare()
	{
		homepage.PersonalCare_Link();
		System.out.println("Suceessfully Click on PersonalCare_Link ");
	}
	
	@AfterMethod
	public void End()
	{
		driver.quit();
	}

}
