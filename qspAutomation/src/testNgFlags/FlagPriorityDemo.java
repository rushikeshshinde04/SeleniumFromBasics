package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagPriorityDemo {
  @Test
  public void Login() 
  {
	  Reporter.log("Logging in...",true);
  }
  @Test(priority = 1)
  public void createuser() 
  {
	  Reporter.log("Creating user...",true);
  }
  @Test(priority = 2)
  public void LogOut() 
  {
	  Reporter.log("Logging Out...",true);
  }
}
