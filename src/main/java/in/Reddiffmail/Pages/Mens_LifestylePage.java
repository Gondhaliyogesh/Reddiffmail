package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class Mens_LifestylePage extends BasePage
{

	public Mens_LifestylePage() throws Exception 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}

}
