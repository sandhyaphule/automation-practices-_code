package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 
{
	
//	5) Fetch data of particular Row
//
//	Step-I :  Highlight whole Table(Findout Xpath Expression)---->//table[@id='table1']
//	Step-II:  Highlight All Rows(use /tr)----> //table[@id='table1']//tbody/tr
//	Step-III: Enter Particular Row ---->//table[@id='table1']/tbody/tr[3]
//	Step-IV: Take for loop for Column
//

	
	
	//Fetch data of particular Row	
		public static void main(String[] args) throws InterruptedException 
		{
			 ChromeOptions CO=new ChromeOptions();
			 WebDriver  driver=new ChromeDriver(CO); 
			
			//To enter URL/Open an Application
			 driver.get("https://omayo.blogspot.com/");
					 
			 Thread.sleep(2000);
			 
			 // Take for loop for Column

			       //i=1       1<=3       2
			                  //2<=3        3
			                  //3<=3        4
			                  //4<=3
			 for(int i=1;      i<=3;     i++) 

			 {
				                                                                              
	WebElement A2=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td["+i+"]"));
				                                        //LHS(String) "+i+"   //RHS(String) 

				String Text2=A2.getText();  //Praveen  //"29"   //Bangalore
				System.out.print(Text2+" ");  //Praveen  //29  //Bangalore	 
			 }
			 System.out.println();
			 
			 }

}
