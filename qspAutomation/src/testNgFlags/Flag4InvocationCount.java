package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4InvocationCount {
  @Test(invocationCount = 1000)
  public void verifyLoginButtonEnableDisableStatus() 
  {
	  Reporter.log("Disabled !!",true);
  }
}
