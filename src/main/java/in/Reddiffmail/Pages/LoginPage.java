package in.Reddiffmail.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Rediffmail.BasePage.BasePage;

public class LoginPage extends BasePage
{
	@FindBy (id="login1")
	private WebElement Username;
	
	@FindBy (id="password")
	private WebElement Password;
	
	@FindBy (name="proceed")
	private WebElement Go_btn;
	
	@FindBy (xpath="/html/body/div/div[1]/div[1]/a/img")
	private WebElement R_logo;
	
	

	public LoginPage() throws Exception
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Rlogin(String uname,String passwd) throws Exception
	{
		Username.sendKeys(uname);
		Password.sendKeys(passwd);
		Go_btn.click();
		
		return new HomePage();
	}
	
	public boolean logo()
	{
		return R_logo.isDisplayed();
	}
	
	

	
	
	
	
}
