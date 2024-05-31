package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 
{
	@Test                         //Test Method/case
	public void OpenKiteZerodha() 
	{
		 //ChromeOptions CO=new ChromeOptions();	
		 WebDriver  driver=new ChromeDriver(); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://kite.zerodha.com/");		 
		 //Maximize Browser
		 driver.manage().window().maximize();	
		 }

}
