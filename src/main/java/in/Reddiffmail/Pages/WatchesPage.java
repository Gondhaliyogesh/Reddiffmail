package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class WatchesPage  extends BasePage
{

	public WatchesPage() throws Exception 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}

}
