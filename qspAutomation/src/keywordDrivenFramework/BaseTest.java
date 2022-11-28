package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		//Browser value from property file
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		//url from property file
		String url = flib.readPropertyData(PROP_PATH, "url");
		//choose the browser
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}
		else
		{
			System.out.println("inValid Browser name");
		}


	}
//Close Browser
	public void tearDown()
	{
		driver.quit();
	}

}
