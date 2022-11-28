package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSforDisabledTextbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		WebElement TextInput = driver.findElement(By.id("textinput-1"));
		Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        if(TextInput.isEnabled())
        {
        	System.out.println("TextBox is Enabled");
        }	
        else
        {
        	System.out.println("TextBox is Disabled");
        	js.executeScript("document.getElementById('textinput-1').value='Rushi'");
        }
        
	}
}