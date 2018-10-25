package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class HomeandDecorePage extends BasePage
{

	public HomeandDecorePage() throws Exception 
	{
		PageFactory.initElements(driver, this);
		
	}

	public String verifytitle()
	{
		return driver.getTitle();
		
	}

}
