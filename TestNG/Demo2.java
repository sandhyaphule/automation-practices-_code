package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void TC3()                     //Test Method/Case-I
	{
		Assert.fail();
		Reporter.log("Running TC3", true);
	}
	
	
	@Test                           //Test Method/Case-II
	public void TC4() 
	{
		Reporter.log("Running TC4", true);	
	}

}
