package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 
{
	
	//3) Fetch Particular Information "Pune"

	//Step-I :   Highlight whole Table(Findout Xpath Expression)---->//table[@id='table1']
	//Step-II:   Highlight All Rows(use //tr)----> //table[@id='table1']//tbody/tr
	//Step-III:  Enter particular Row ----> //table[@id='table1']//tbody/tr[2]
	//Step-IV:  Highlight Particular Column-->//table[@id='table1']//tbody/tr[2]/td[3]

	public static void main(String[] args) throws InterruptedException 
	{		 
        ChromeOptions CO=new ChromeOptions();
		 WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		 driver.get("https://omayo.blogspot.com/");
				 
		 //wait
		 Thread.sleep(2000);
		
		//Fetch "Pune" 
	    WebElement	 S3=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]/td[3]")); 
		     String  text=S3.getText();  //Pune  
		     System.out.println(text);
		     
	}


}
