package in.Rediffmail.BasePage;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage
{
	public static WebDriver driver;
	public static Properties prop;

	public BasePage() throws Exception
	{
		FileInputStream fis=new FileInputStream("F:\\JenkinsProject\\Reddiffmail\\src\\main\\java"
												 + "\\in\\Rediffmail\\config\\config.properties");
		prop=new Properties();
		prop.load(fis);
	}

	public static void Initilization() 
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\MyFrameworks\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Launch Chrome Successfully");
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("Launch Firefox Successfully");
		}
		else
		{
			System.out.println("Browser not availabel");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
		
		driver.get(prop.getProperty("URL"));
		
		}


}
