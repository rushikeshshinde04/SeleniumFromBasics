package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rushi/Desktop/selenium_data/htmls%20to%20perform%20diff%20actions/SingleSelectDropDown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement element = driver.findElement(By.id("cars"));
		Select sel=new Select(element);
		sel.selectByIndex(7);
		Thread.sleep(4000);
		sel.selectByValue("Skoda");
		Thread.sleep(4000);
		sel.selectByVisibleText("Tata");
		Thread.sleep(4000);

	}

}
