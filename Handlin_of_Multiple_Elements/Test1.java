package Handlin_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException
	{		
		
		WebDriver driver= new ChromeDriver();
		 		 
		//To enter URL/Open an Application	
		 driver.get("https://www.facebook.com/");
		 
		//maximize Browser
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		//To get Text of All the Links identifiy	 
        List<WebElement> Alllinks=driver.findElements(By.xpath("//a"));  //46 link Addresses
		 	 
	     for(WebElement link:Alllinks)  //46 link Addresses //3 Address
	      {
		   String  T1=link.getText();//signup//login//  
		   System.out.println(T1);//signup//login
	     }
		 }
          }
