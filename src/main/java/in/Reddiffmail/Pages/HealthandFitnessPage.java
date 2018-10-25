package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class HealthandFitnessPage extends BasePage 
{

	public HealthandFitnessPage() throws Exception 
	{
		PageFactory.initElements(driver, this);

	}

	public String verifyTitle()
	{
		return driver.getTitle();
	}
}
