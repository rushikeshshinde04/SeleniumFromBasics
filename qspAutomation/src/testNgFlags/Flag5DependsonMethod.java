package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5DependsonMethod {
	  @Test
	  public void Login() 
	  {
		  Reporter.log("Logging in...",true);
	  }
	  @Test(dependsOnMethods = "Login")                 //So that control go to next method
	  public void createuser() 
	  {
		  Reporter.log("Creating user...",true);
	  }
	  @Test(priority = 1)
	  public void LogOut() 
	  {
		  Reporter.log("Logging Out...",true);
	  }
}
