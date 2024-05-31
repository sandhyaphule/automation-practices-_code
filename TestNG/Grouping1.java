package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 
{
	@Test(groups="Login")                           //Test Method/case
	public void TC1() 
	{
		Reporter.log("Running Method TC1", true);
	}
	
	@Test(groups="Login")                             //Test Method/case
	public void TC2() 
	{
		Reporter.log("Running Method TC2", true);
	}
	
	@Test(groups="Mobile")                           //Test Method/case
	public void TC3() 
	{
		Reporter.log("Running Method TC3", true);
	}
	
	@Test(groups="Fashion")                            //Test Method/case
	public void TC4() 
	{
		Reporter.log("Running Method TC4", true);
	}
			
	@Test(groups="Fashion")                         //Test Method/case
	public void TC5() 
	{
		Reporter.log("Running Method TC5", true);
	}
	@Test(groups="Travel")                           //Test Method/case
	public void TC6() 
	{
		Reporter.log("Running Method TC6", true);
	}	
			
	@Test(groups="Change Password")                             //Test Method/case
	public void TC7() 
	{
		Reporter.log("Running Method TC7", true);
	}


}
