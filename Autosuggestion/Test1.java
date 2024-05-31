package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	//How to Handle  Autosuggesion
	public static void main(String[] args) throws InterruptedException 

		{	
			 ChromeOptions CO=new ChromeOptions();
			 WebDriver  driver=new ChromeDriver(CO); 

			
			//To enter URL/Open an Application
			 driver.get("https://www.google.com/");

					 
			 //wait
			 Thread.sleep(2000);

			 
			 //Enter "skybags" driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("skybags");
			 
			 //wait
			 Thread.sleep(2000);

			  
			 //Highlight All options 
	List<WebElement> AllOptions=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li"));
			 
		 //wait
		 Thread.sleep(2000);


			 
		for(WebElement OP:AllOptions) //Skybags  //skybags trolley bags  //skybags backpack
		{
			  String  text=OP.getText();  //Skybags  //skybags trolley bags  //skybags backpack
			
		//skybags backpack
			if(text.equals("skybags backpack")) 
			{
				OP.click();
				break;
			}
			  
			  
			  
		}
		
		
		
			 
		}
		
	}



