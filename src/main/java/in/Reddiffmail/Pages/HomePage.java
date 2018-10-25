package in.Reddiffmail.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class HomePage extends BasePage
{
	@FindBy (xpath="//*[@id=\"signin_info\"]/a[1]")
	private WebElement signin_btn;
	
	@FindBy(id="redifflogo")
	private WebElement Hlogo;
	
	@FindBy(xpath="//*[@id=\"topcat3\"]")
	private WebElement mobile_link;
	
	@FindBy(partialLinkText="Men's Lifestyle")
	private WebElement mens_lifistyle;
	
	@FindBy(partialLinkText="Women's Lifestyle")
	private WebElement womens_lifestyle;
	
	@FindBy(partialLinkText="Electronics")
	private WebElement electronics;
	
	@FindBy(partialLinkText="Watches")
	private WebElement watches;
	
	@FindBy(partialLinkText="Home & Decor")
	private WebElement homed_decor;
	
	@FindBy(partialLinkText="Personal Care")
	private WebElement personal_care;
	
	@FindBy(partialLinkText="Health & Fitness")
	private WebElement health_fitness;
	
	@FindBy(partialLinkText="Books")
	private WebElement books;
	
	public HomePage() throws Exception
	{
		PageFactory.initElements(driver, this);
		
	}
	public LoginPage Verifylogin() throws Exception
	{
		signin_btn.click();
		return new LoginPage();
	}
	public boolean logo()
	{
		return Hlogo.isDisplayed();
	}
	
	public MobilesPage Mobiles_Link() throws Exception
	{
		mobile_link.click();
		return new MobilesPage();
	}
	
	public void Mens_Lifestyle_Link()
	{
		mens_lifistyle.click();
	}
	public void Womens_Lifestyle_Link()
	{
		womens_lifestyle.click();
	}
	
	public void Electronics_Link()
	{
		electronics.click();
	}

	public void Watches_link()
	{
		watches.click();
	}
	
	public void HomeDecore_link()
	{
		homed_decor.click();
	}
	
	public void PersonalCare_Link()
	{
		personal_care.click();
	}
	
	public void HealthandFitness_link()
	{
		health_fitness.click();
	}
	
	public void Books_link()
	{
		books.click();
	}
	
}
