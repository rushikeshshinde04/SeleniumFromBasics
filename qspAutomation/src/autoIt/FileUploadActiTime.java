package autoIt;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadActiTime 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-oemn2f6/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.partialLinkText("Logo")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		
		//Integration
		Runtime.getRuntime().exec("C:\\Users\\rushi\\Desktop\\eclipse-workspase v2022\\qspAutomation\\AutoIT\\Au.exe");
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\rushi\\Desktop\\eclipse-workspase v2022\\qspAutomation\\AutoIT\\Au.exe");

		
	}

}
