package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 
{
	@Test(invocationCount=5)
	public void TC1()                     //Test Method/Case-I
	{
		Reporter.log("Running TC1", true);
	}
	
	
}
//invocationCount it is used to multiple time run test case