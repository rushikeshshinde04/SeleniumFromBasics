package dropdowns;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentRemoveDuplicate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rushi/Desktop/selenium_data/htmls%20to%20perform%20diff%20actions/MultiSelectDropDown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement element = driver.findElement(By.id("cars"));
		Select sel=new Select(element);
		
		List<WebElement> ops = sel.getOptions();
		
		//HashSet<String> set = new HashSet<String>();
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<ops.size();i++)
		{
			WebElement allops = ops.get(i);
		String text = allops.getText();
		set.add(text);
		}
		for(String se:set)
		{
			System.out.println(se);
		}

	}

}
