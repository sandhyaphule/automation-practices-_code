package Framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_BaseClass 
{
	private static final String duartion=null;
	//Base class
	
	public WebDriver driver;
	
	public void InitilizeBrowser() 
	{
		//open Browser
		
		//ChromeOptions CO=new ChromeOptions();	
		 driver=new ChromeDriver(); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 //Maximize Browser
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		 
		 }

		
	}


