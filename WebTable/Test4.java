package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 
{
//	4) Fetch Particular Information "Dheepthi"
//
//	Step-I :  Highlight whole Table(Findout Xpath Expression)---->//table[@id='table1']
//	Step-II:  Highlight All Rows(use /tr)----> //table[@id='table1']/tbody/tr
//	Step-III: Enter Particular Row ----> //table[@id='table1']/tbody/tr[4]
//	Step-IV:  Highlight Particular Column-->//table[@id='table1']/tbody/tr[4]/td[1]


	
	
	
	public static void main(String[] args) throws InterruptedException 
	{

		 ChromeOptions CO=new ChromeOptions();
		 WebDriver  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		 driver.get("https://omayo.blogspot.com/");
				 
		 //wait
		 Thread.sleep(2000);
		 
		
		 //Fetch Particular Information "Dheepthi"
		 
             WebElement A1=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[1]"));
		
		          String   Text1=A1.getText();  //Dheepthi	
		
		          System.out.println(Text1); //Dheepthi	
	}


}
