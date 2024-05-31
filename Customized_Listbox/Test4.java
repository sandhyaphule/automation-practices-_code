package Customized_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		 //press Home key on keybord
		 act.sendKeys(Keys.HOME).perform();//jan
		 Thread.sleep(2000);
		 
		 //press Arrowup key 5 times
		 for(int i=1;i<=6;i++)
		 {
			 act.sendKeys(Keys.ARROW_DOWN).perform();//jul
			 Thread.sleep(2000);
		 }
		 
		 Thread.sleep(2000);

			 //select jul
			 act.sendKeys(Keys.ENTER).perform();//jul


		 }
		 

}
