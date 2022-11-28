package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestActitimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();//open the browser and launch actiTime
		Flib flib = new Flib();
		//read the username and password from property file
		String validUsername = flib.readPropertyData(PROP_PATH, "username");
		String validPassword = flib.readPropertyData(PROP_PATH, "password");
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		
		driver.findElement(By.id("loginButton")).click();
		
		bt.tearDown();
	}

}