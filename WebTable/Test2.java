package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 
{
	//2) To find Column size

	//Step-I :  Highlight whole Table(Findout Xpath Expression)---->//table[@id='table1']
	//Step-II:  Highlight All Rows(use //tr)---->//table[@id='table1']//tr
   //	Step-III: Enter particular Row ---->(//table[@id='table1']//tr)[1] 
	// or  
	//table[@id='table1']//tr[1]
	//Step-IV:  Highlight all Columns(use /th)-->(//table[@id='table1']//tr)[1]/th
	 //or 
	//table[@id='table1']//tr[1]/th

	//To find Column size
			public static void main(String[] args) throws InterruptedException 
			{
			 ChromeOptions CO=new ChromeOptions();
			WebDriver  driver=new ChromeDriver(CO); 
				
				//To enter URL/Open an Application
				 driver.get("https://omayo.blogspot.com/");
						 
				 //wait
				 Thread.sleep(2000);
				
				//To find Column size
			
	 List<WebElement> AllcolumnAddresses=driver.findElements(By.xpath("//table[@id='table1']//tr[1]/th"));	
	             int  S2=AllcolumnAddresses.size();   //3 
	             System.out.println(S2);
				
			}
			
		

	
	

}
