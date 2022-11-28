package stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-oemn2f6/login.do");
		Thread.sleep(2000);
		WebElement UsernameTextBox = driver.findElement(By.name("username"));//@ABC123
		UsernameTextBox.sendKeys("admin");
		driver.navigate().refresh();
		//@EF123             address of element changes after refresh so give stale(old)elementException
		Thread.sleep(2000);
		UsernameTextBox.clear();
		UsernameTextBox.sendKeys("Rushi");
		
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).clear();             //Works with it
//		driver.findElement(By.name("username")).sendKeys("Rushi");




	}

}
