package pageObjetModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration for all the webelements present on HomePage
	
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTaskLink;
	@FindBy(xpath ="//a[text()='Logout']") private WebElement logOutLink;
	@FindBy(xpath = "//a[text()='Insert existing tasks']") private WebElement insertExistingTaskLink;

	
	//initialization

	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	public WebElement getInsertExistingTaskLink() {
		return insertExistingTaskLink;
	}
	
	//logOut Method
	public void logOutMethod()
	{
		logOutLink.click();
		
	}

}
