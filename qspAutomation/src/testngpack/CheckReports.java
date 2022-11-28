package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckReports {
	@Test
	public void checkreport() 
	{
		// System.out.println("Rushi");//only give o/p in console
		//Reporter.log("Rushi");//Only give O/p in E-Report
		Reporter.log("Rushi",true);
		
	}
}
