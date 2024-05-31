package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		WebDriver driver= new ChromeDriver();

	//To enter URL/Open an Application	
	 driver.get("https://demo.automationtesting.in/Frames.html");
	 
	 
	 //Wait
	 Thread.sleep(2000);
	 
	 
	//Step-I:Identify Element and store it into an object	 
      WebElement S1 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
 
      //Step-II:Create object of Actions Class
      Actions act=new Actions (driver);
      
 
	    //Step-III:Call the method(Right Click)               
        // act.click(S1).perform();
         act.contextClick(S1).perform();//compalsary .perfrom  
   
   
       
	}

}
