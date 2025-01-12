package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations 
{
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("Open Browser", true);
	}
		
	@BeforeMethod
	public void LoginToAPP() 
	{
		Reporter.log("Login TO App", true);
	}
	
	@Test                          //Test Method/case
	public void TC1() 
	{
		Reporter.log("Running TC1", true);
	}
	
	
	@Test                          //Test Method/case
	public void TC2() 
	{
		Reporter.log("Running TC2", true);
	}
	
	
	@AfterMethod
	public void LogoutFromApp() 
	{
		Reporter.log("Logout from App", true);
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("Close Browser", true);
	}
}
