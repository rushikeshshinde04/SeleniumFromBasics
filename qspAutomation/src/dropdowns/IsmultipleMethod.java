package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsmultipleMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/rushi/Desktop/selenium_data/htmls%20to%20perform%20diff%20actions/SingleSelectDropDown.html");
        WebElement element = driver.findElement(By.id("cars"));
		Select sel=new Select(element);
		Thread.sleep(4000);
		boolean check = sel.isMultiple();
		System.out.println(check);
		
		Thread.sleep(2000);
		
		driver.navigate().to("file:///C:/Users/rushi/Desktop/selenium_data/htmls%20to%20perform%20diff%20actions/MultiSelectDropDown.html");
		WebElement element1 = driver.findElement(By.id("cars"));
		sel=new Select(element1);
		boolean check1 = sel.isMultiple();
		System.out.println(check1);
	}

}
