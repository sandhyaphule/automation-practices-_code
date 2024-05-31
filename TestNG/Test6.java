package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 
{
	@Test(priority=2)                          //Test Method/case
	public void TC1() 
	{
		Reporter.log("Running Method TC1", true);
	}
	
	@Test(priority=1)                           //Test Method/case
	public void TC2() 
	{
		Reporter.log("Running Method TC2", true);
	}

	
	@Test(priority=1)                           //Test Method/case
	public void TC3() 
	{
		Reporter.log("Running Method TC3", true);
	}
}
