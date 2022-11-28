package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class TestActitimeInvalidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();//open the browser and launch actiTime
		Flib flib = new Flib();
		
		int rc=flib.getRowCount(Excel_PATH, "invaliddata");
		
		for(int i=1;i<rc;i++)
		{
			String invalidUsername=flib.readExcelData(Excel_PATH, "invaliddata", i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidUsername);	
			String invalidPassword=flib.readExcelData(Excel_PATH, "invaliddata", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
		bt.tearDown();
	}

}
