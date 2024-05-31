package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 
{
	@Test                         //Test Method/case
	public void OpenFacebook() 
	{
		 //ChromeOptions CO=new ChromeOptions();	
		 WebDriver  driver=new ChromeDriver(); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.facebook.com/");
		 
		 //Maximize Browser
		 driver.manage().window().maximize();	
		 }

	

}
