package framesHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameBluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Rushi");
		driver.findElement(By.id("chat-fc-email")).sendKeys("rushi123@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9420019067");

		
		
		

	}

}
