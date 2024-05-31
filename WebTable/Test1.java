package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//1) To find Row size

	//Step-I : Highlight whole Table(Findout Xpath Expression)---->//table[@id='table1']
	//Step-II: Highlight All Rows (use //tr)---->//table[@id='table1']//tr

	public class Test1 
	{
	   //To find Row size
		public static void main(String[] args) throws InterruptedException 
		{
			//open chrome
			 ChromeOptions CO=new ChromeOptions();
			 WebDriver  driver=new ChromeDriver(CO); 
			
			//To enter URL/Open an Application
			 driver.get("https://omayo.blogspot.com/");
					 
			 //wait
			 Thread.sleep(2000);
			
			
			 //To find Row size
		List<WebElement> Allrowaddresses=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		            int S1=Allrowaddresses.size();  //5
		            System.out.println(S1);
			
		}
		
		
	}

	//Console:
	//5


	
	
	
	
	
	


