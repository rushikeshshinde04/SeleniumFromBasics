package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPpup {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("file:///C:/Users/rushi/Desktop/AlertPopup1.html");
			driver.findElement(By.xpath("//button[.='Try it']")).click();
			Thread.sleep(2000);
			Alert a=driver.switchTo().alert();
			String txt = a.getText();
			System.out.println(txt);
			Thread.sleep(2000);
			a.accept();

   }
  
}
