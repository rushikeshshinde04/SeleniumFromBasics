package pageObjetModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declare all the webElements present on Login page
	//findBy always give the new address
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	//@Findbys for multiple elements
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath ="//a[contains(text(),'License')]")private WebElement licenseLink;

	//initialization	

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	//instructs findby to get current address
	}	

	//Utilization

	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	//valid login method

	public void validLoginToActiTime(String validUsername, String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(2000);
	}

	//valid login method

	public void inValidLoginToActiTime(String validUsername, String validPassword) throws InterruptedException
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(2000);
		usn.clear();
	}



}
