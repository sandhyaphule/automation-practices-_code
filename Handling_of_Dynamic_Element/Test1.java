package Handling_of_Dynamic_Element;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	//How to handle Dynamic Element
		public static void main(String[] args) throws InterruptedException, IOException 
		{		
			 ChromeOptions CO=new ChromeOptions();	
			 WebDriver  driver=new ChromeDriver(CO); 
			 		 
			//To enter URL/Open an Application		 
			 
			 driver.get("https://www.flipkart.com/search?q=redmi+note+10s&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_14_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_14_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=redmi+note+10s%7CMobiles&requestId=2f02abd0-6677-443d-8632-fdee7f7bd630");
			 
			 Thread.sleep(2000);
			 
			 //To get Rating
	String S1=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[7]")).getText(); //87521 Ratings
			 
			 System.out.println(S1);//87521 Ratings	 

		}
}
