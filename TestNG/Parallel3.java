package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 
{
	@Test                         //Test Method/case
	public void OpenFlipkart() 
	{
		 //ChromeOptions CO=new ChromeOptions();	
		 WebDriver  driver=new ChromeDriver(); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.flipkart.com/");		 
		 //Maximize Browser
		 driver.manage().window().maximize();	
		 }

}
