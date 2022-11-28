package windowHandleMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Nothing Phone");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String ParentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='col col-7-12']/descendant::div[.='Nothing Phone (1) (White, 256 GB)'])[1]")).click();
		Set<String> AllHandles = driver.getWindowHandles();
		for(String handle:AllHandles)
		{
			if(!ParentHandle.equals(handle))
			{
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Black']/ancestor::li[@id='swatch-0-color']/descendant::a")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='12 GB']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("413507");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Check']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Remove']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[.='Remove'])[1]")).click();
	}

}
