package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test8 
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
    
	
	@Test()     ////by default priority=0     //1   //Test Method/case
	public void TC4() 
	{
		Reporter.log("Running Method TC4", true);
	}
    
	
	
	@Test()     ////by default priority=0     //1   //Test Method/case
	public void TC5() 
	{
		Reporter.log("Running Method TC5", true);
	}
}



