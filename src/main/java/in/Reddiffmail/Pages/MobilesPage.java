package in.Reddiffmail.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class MobilesPage extends BasePage
{
	@FindBy (xpath="//a/img[@class='shsprite shoptoplogo']")
	private WebElement logo1;
	
	
	public MobilesPage() throws Exception 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLogorediff()
	{
		return logo1.isDisplayed();
	}
	
	public String url()
	{
		return driver.getCurrentUrl();
	}
	public String title()
	{
		return driver.getTitle();
	}

}
