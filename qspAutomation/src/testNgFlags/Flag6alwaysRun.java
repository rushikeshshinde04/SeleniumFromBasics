package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6alwaysRun {
	  @Test
	  public void LoginMethod() 
	  {
		  int result=5/0;
		  System.out.println(result);
		  Reporter.log("Logging in...",true);
	  }
	  @Test(dependsOnMethods = "LoginMethod")                 //So that control go to next method
	  public void createuser() 
	  {
		  Reporter.log("Creating user...",true);
	  }
	  @Test(dependsOnMethods = "LoginMethod", alwaysRun=true)   
	  public void LogOutMethod() 
	  {
		  Reporter.log("Logging Out...",true);
	  }
}
