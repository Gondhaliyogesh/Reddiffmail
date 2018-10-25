package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class Personal_CarePage extends BasePage
{

	public Personal_CarePage() throws Exception 
	{

		PageFactory.initElements(driver, this);
		
	}
	
	public String verifytitle()
	{
		return driver.getTitle();
	}

	

}
