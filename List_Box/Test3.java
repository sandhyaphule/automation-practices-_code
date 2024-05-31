package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	//open browser
	ChromeOptions option = new ChromeOptions();
	option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
	WebDriver driver= new ChromeDriver();
	
	//To enter URL/Open an Application	
	 driver.get("file:///D:/15%20April/Listbox/MultiselectableListbox.html");
	 
	 //Wait
	 Thread.sleep(2000);
	 
	 
	//Step-I:Identify Listbox and store it into an object	 
	WebElement Multiselectable=driver.findElement(By.xpath("//select[@id='1234']"));

	 //Step-II:Create object of Select Class
	  Select S1=new Select(Multiselectable);
	  S1.selectByIndex(0);//ind
	  
	//Wait
     Thread.sleep(2000);
	  
	  S1.selectByIndex(2);//pak

	//Wait
	 Thread.sleep(2000);
	  
	  S1.selectByIndex(1);//sri

	//Wait
    Thread.sleep(2000);
		 
    
    S1.selectByIndex(3);//aus

	//Wait
    Thread.sleep(2000);
	 
	 //Step-III:Call the method 
	 S1.selectByVisibleText("Ind");
	  
	 S1.selectByVisibleText("Pak"); 	  
	}
}

