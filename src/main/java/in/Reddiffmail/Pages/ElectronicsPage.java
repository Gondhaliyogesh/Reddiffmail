package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class ElectronicsPage extends BasePage 
{

	public ElectronicsPage() throws Exception
	{
		PageFactory.initElements(driver, this);
		
	}

}
