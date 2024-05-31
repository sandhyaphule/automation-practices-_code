package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException
	{		
		 ChromeOptions CO=new ChromeOptions();	
		 WebDriver  driver=new ChromeDriver(CO); 
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.facebook.com/");
		 
		 //Wait
		 Thread.sleep(2000);
		 
		//Click Create new Account Button
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		 //Wait
		 Thread.sleep(2000);
		 
		 
		//Step-I:Identify Listbox and store it into an object	 
	  WebElement S2=driver.findElement(By.id("month"));
	  
	  //Step-II:Create object of Actions Class
	    Actions act=new Actions(driver);
	  
	    //Step-III:Call the method (Left Click)  //mouse related activity perfrom karyche .click
	    act.click(S2).perform();
	    
	    
	    //Wait
		 Thread.sleep(2000);
	    
	  //To move downward   
		act.sendKeys(Keys.DOWN).perform(); //march
		 //Wait
		 Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform();  //april
		 //Wait
		 Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).perform(); //May 
	   
		//Wait
		 Thread.sleep(2000);
		 
		  //To move upward  
		 
		 act.sendKeys(Keys.UP).perform();//april
		 
		//Wait
		 Thread.sleep(2000);
		 
		 act.sendKeys(Keys.UP).perform();//May
		 
		 

		 
		 //Select Option
		act.sendKeys(Keys.ENTER).perform(); //March
	
	}
}



