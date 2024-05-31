package Framework;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM_TestClass extends OrangeHRM_BaseClass
{
	//Sub class
	//public webdriver driver;
	//initilizeBrowser()
	OrangeHRM_Login login;
	OrangeHRM_DashBoard DashBoard ;
	String TestCaseID;

	
	@BeforeClass
	public void OpenBrowser() 
	{
		InitilizeBrowser();	
		//Create Object Of POM-I
		login=new OrangeHRM_Login(driver);	
		
		//Create Object Of POM-II
		DashBoard= new OrangeHRM_DashBoard(driver);
	}
    
	@BeforeMethod
	public void LoginToAPP() throws IOException, InterruptedException 
	{
		
        Thread.sleep(5000);
		login.enterUsername();
        Thread.sleep(5000);
		login.enterPassword();
        Thread.sleep(5000);
		login.clickloginbutton();
	}
		@Test(priority=2)
		public void VerifyUserNameDashBord() throws IOException
		{
			  TestCaseID="TC001";

			//actual Result
	    	 
	    	String ActualResult= DashBoard.gettextofUserName();//java automation
	    	 
	    	 //actual and excepted result
	    	
	    	String ExceptedResult=OrangeHRM_UtilityClass.getDataFromExcelSheet(0,0);//java automation
	    	
	    	//Actual &accepted Result
    	Assert.assertEquals(ActualResult,ExceptedResult);//java automation--->pass
	}
     
		
	@Test(priority=2)
	public void VerifyTittle() throws IOException
	{
	  TestCaseID="TC002";

    	//Actual &accepted Result
		String ActualTittle = driver.getTitle();//OrangeHRM
    	String ExceptedTittle=OrangeHRM_UtilityClass.getDataFromExcelSheet(1,0);//java automation
    	Assert.assertEquals(ActualTittle,ExceptedTittle);//java automation--->pass
    	Assert.fail();
	}
		
     @AfterMethod                          //pass //fail
     public void LogOutFromToAPP(ITestResult Result) throws InterruptedException, IOException
     {
               //pass    //fail  	 
    	 if(Result.getStatus()==ITestResult.FAILURE);//false
    	 {
    		 OrangeHRM_UtilityClass.CaptureScreenshot(driver, TestCaseID);
    	 }
    	 
         Thread.sleep(2000);
    	 DashBoard.ClickUserName(); 
         Thread.sleep(2000);
    	 DashBoard.ClickLogoutButton();
     }
     
     @AfterClass
     public void closeBrowser()
     {
    	 driver.close();
     }
}
