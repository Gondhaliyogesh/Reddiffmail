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
	

}
