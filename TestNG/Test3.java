package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
	@Test
	public void TC1()                     //Test Method/Case-I
	{
		Reporter.log("Running TC1", true);
	}
	
	
	@Test                           //Test Method/Case-II
	public void TC2() 
	{
		Reporter.log("Running TC2", true);	
	}
	
	
	@Test                           //Test Method/Case-III
	public void TC3() 
	{
		Reporter.log("Running TC3", false);	
	}
	
	
	@Test                           //Test Method/Case-IV
	public void TC4() 
	{
		Reporter.log("Running TC4");	
	}
	
	
	@Test                           //Test Method/Case-V
	public void TC5() 
	{
		System.out.println("Running TC5");
	}
	

}


