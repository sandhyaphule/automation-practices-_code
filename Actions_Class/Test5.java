package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException 
	{

			 ChromeOptions CO=new ChromeOptions();
			 WebDriver  driver=new ChromeDriver(CO); 
			
			//To enter URL/Open an Application
			 driver.get("https://demo.guru99.com/test/drag_drop.html");
					 
			 //wait
			 Thread.sleep(2000);
			 
			driver.manage().window().maximize(); 
			 
			 	
			//Step-I:Identify element and store it into an object 		 
	WebElement	Source=driver.findElement(By.xpath("//a[text()=' 5000']"));	 

	WebElement	destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
			
		
			 //Step-II:Create object of Actions Class
				Actions act=new Actions(driver);

			 //Step-III:Call the method(Drag and Drop)        
			 act.dragAndDrop(Source,destination).perform();
			 
		}
		
		
	}


