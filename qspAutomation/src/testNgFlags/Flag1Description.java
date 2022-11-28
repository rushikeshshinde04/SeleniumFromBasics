package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1Description {
  @Test(description = "this method helps to login to the Actitime app")  //For giving Description of method
  public void loginActiTime()
  {
	  Reporter.log("Logging in....",true);
  }
  
  @Test(description = "this method helps to Logout to the Actitime app")
  public void logOutActiTime()
  {
	  Reporter.log("Logging Out....",true);
  }
}
