package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable2 
{
	@Test                           //Test Method/case
	public void TC1() 
	{
		Reporter.log("Running Method TC1", true);
	}
	
	@Test                          //Test Method/case
	public void TC2() 
	{
		Reporter.log("Running Method TC2", true);
	}
	
	@Test                           //Test Method/case
	public void TC3() 
	{
		Reporter.log("Running Method TC3", true);
	}
	
	@Test                           //Test Method/case
	public void TC4() 
	{
		Reporter.log("Running Method TC4", true);
	}
		


}
