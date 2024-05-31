package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	//Normal_Class 
	            public static void main(String[] args) 
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
