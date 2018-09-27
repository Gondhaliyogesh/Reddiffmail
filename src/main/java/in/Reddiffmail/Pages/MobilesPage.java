package in.Reddiffmail.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.Rediffmail.BasePage.BasePage;

public class MobilesPage extends BasePage
{
	@FindBy (xpath="/html/body/div[1]/div[1]/div[3]/div/a/img")
	private WebElement logo1;
	
	
	public MobilesPage() throws Exception 
	{
		super();
	}
	
	public boolean verifyLogorediff()
	{
		return logo1.isDisplayed();
	}
	
	public String url()
	{
		return driver.getCurrentUrl();
	}

}
