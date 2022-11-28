package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/rushi/Desktop/selenium_data/htmls%20to%20perform%20diff%20actions/MultiSelectDropDown.html");
        WebElement element = driver.findElement(By.id("cars"));
		Select sel=new Select(element);
		for(int i=7;i<=10;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		List<WebElement> allops = sel.getAllSelectedOptions();
		for(WebElement ops:allops)
		{
			String txt = ops.getText();
			System.out.println(txt);
		}

	}

}
