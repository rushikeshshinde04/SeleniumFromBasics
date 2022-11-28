package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/rushi/Desktop/selenium_data/htmls%20to%20perform%20diff%20actions/SingleSelectDropDown.html");
        WebElement element = driver.findElement(By.id("cars"));
		Select sel=new Select(element);
		List<WebElement> allops = sel.getOptions();
		Thread.sleep(4000);
		for(WebElement ops:allops)
		{
			String txt = ops.getText();
			System.out.println(txt);
			
			if(ops.getText().equals("Tata"))
			{
				ops.click();
				break;
			}
		}

	}

}
