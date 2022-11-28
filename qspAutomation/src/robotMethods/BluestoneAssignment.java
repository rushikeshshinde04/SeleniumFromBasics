package robotMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssignment 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwqoibBhDUARIsAH2OpWijflQ37KcdHuFDV_MGu_quEWUuq7U6cemIaxhMrtvBz5-6t1xSmRYaAtrTEALw_wcB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("denyBtn")).click();
		WebElement element = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		//Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(1000);
		Robot rbt = new Robot();
		for(int i=0;i<2;i++)
		{
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(1000);
		//rbt.keyPress(KeyEvent.VK_ENTER);
		//rbt.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//div[.='Filter by']"));
		
		for(int k=0;k<=2;k++)
		{
			act.clickAndHold(ele1).perform();
		}
				
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}//clickandhold

}
