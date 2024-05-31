package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3
{
	@Test
	public void TC5()                     //Test Method/Case-I
	{
		Reporter.log("Running TC1", true);
	}
	
	
	@Test                           //Test Method/Case-II
	public void TC6() 
	{
		Assert.fail();
		Reporter.log("Running TC2", true);	
	}


	//how select all class in shortkey ctrl key press

}
