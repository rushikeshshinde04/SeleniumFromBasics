package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SSW5 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQjwqoibBhDUARIsAH2OpWijflQ37KcdHuFDV_MGu_quEWUuq7U6cemIaxhMrtvBz5-6t1xSmRYaAtrTEALw_wcB");
        driver.findElement(By.id("denyBtn")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss5.png");
		Files.copy(src, dest);


	}

}
