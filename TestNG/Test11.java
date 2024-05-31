package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test11 
{
	@Test(timeOut=5000)
	public void TC1()                     //Test Method/Case-I
	{
		Reporter.log("Running TC1", true);
	}
	
	
	@Test                           //Test Method/Case-II
	public void TC2() 
	{
		Reporter.log("Running TC2", true);	
	}
	

}
