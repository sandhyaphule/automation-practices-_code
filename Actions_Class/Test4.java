package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		 ChromeOptions CO=new ChromeOptions();
		 WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				 
		 //wait
		 Thread.sleep(2000);
		 
		
		//Step-I:Identify element and store it into an object 
	WebElement S1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
		 //Step-II:Create object of Actions Class
		Actions act=new Actions(driver);
			              
	    //Step-III:Call the method(Double Click)         
		 act.doubleClick(S1).perform();
		 
	}
	
	
	
}



