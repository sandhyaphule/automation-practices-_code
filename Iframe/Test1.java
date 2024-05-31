package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 
		 //maximize Browser
		 driver.manage().window().maximize();
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 //Switch to iFrame(String Framename)
		 driver.switchTo().frame("iframeResult");
		  
		 //Wait
		 Thread.sleep(2000);
		
		//Click "Click me to display Date and Time" Button
	 driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
