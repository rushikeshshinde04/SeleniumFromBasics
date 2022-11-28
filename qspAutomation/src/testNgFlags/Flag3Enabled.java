package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3Enabled {
  @Test(enabled = false)
  public void createUser() 
  {
	  Reporter.log("Creating User",true);
  }
  
  @Test(enabled = true)
  public void login() 
  {
	  Reporter.log("logging User",true);
  }
}
