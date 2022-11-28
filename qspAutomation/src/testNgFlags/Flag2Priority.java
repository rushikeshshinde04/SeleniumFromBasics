package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2Priority {
	@Test(priority = 3)  // Then it will not run
	public void z() //Executes first according to Alphabetical Order
	{
		Reporter.log("z method",true);                                // Ans: //a b g j k s w x z
	}
	@Test (priority = 3)   //executes at 3rd
	public void x()
	{
		Reporter.log("x method",true);  

	}
	@Test(priority = 3)
	public void w() 
	{
		Reporter.log("w method",true);  

	}
	@Test
	public void j() 
	{
		Reporter.log("j method",true);  

	}                                   
	@Test
	public void g() 
	{
		Reporter.log("g method",true);  

	}
	@Test(priority = 2)
	public void k()
	{
		Reporter.log("k method",true);  

	}
	@Test(priority = 2)
	public void s() 
	{
		Reporter.log("s method",true);  

	}
	@Test
	public void b() 
	{
		Reporter.log("b method",true);  

	}
	@Test(priority = 0)   //no priority and 0 will work same
	public void a() 
	{
		Reporter.log("a method",true);  

	}
}
