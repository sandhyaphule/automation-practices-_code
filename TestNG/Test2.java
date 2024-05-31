package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test2 
{
	@Test
	
	public void OpenFacebook()                   //Test Method/Test Case
	{
		//open browser
		ChromeOptions option = new ChromeOptions();
		WebDriver driver= new ChromeDriver();
		
		//To enter URL/Open an Application				
		 driver.get("https://www.facebook.com/");//driver it as interface
		
		//maximxe Browser
		driver.manage().window().maximize();//windows it as interface
		
		
	}
}
