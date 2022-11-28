package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeValidLogin {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-oemn2f6/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Flib flib=new Flib();
		
		String validUsername = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		
		String validPassword = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		
		driver.findElement(By.xpath("//a[.='Login']")).click();
	}

}
