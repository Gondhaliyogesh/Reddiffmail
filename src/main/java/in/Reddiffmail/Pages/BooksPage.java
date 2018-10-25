package in.Reddiffmail.Pages;

import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class BooksPage extends BasePage
{

	public BooksPage() throws Exception 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	

}
