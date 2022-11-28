package testngAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class ActitimeInvalidLogin {
	WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=1l4514s15e7b2");
	}


	@DataProvider
    public Object [][] dataProviderActitime()
    {
		Object[][] data = new Object[5][2];
		
		data[0][0]="admin";
		data[0][1]="manger";
		
		data[1][0]="adin";
		data[1][1]="mangr";
		
		data[2][0]="amin";
		data[2][1]="mange";
		
		data[3][0]="adin";
		data[3][1]="mnger";
		
		data[4][0]="amin";
		data[4][1]="mnger";
		return data;
    }
	
	@Test(dataProvider = "dataProviderActitime")
	public void testInvalidLogin(String username, String password) 
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}
