package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test1 
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
      WebElement S1 = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
 
      //Step-II:Create object of Actions Class
      Actions act=new Actions (driver);
      
 
	    //Step-III:Call the method(Move Curser)               
         act.click(S1).perform();
         
         act.moveToElement(S1).perform();//compalsary ahe .perfrom 
   
   
       //Wait
	    Thread.sleep(2000);
	 
	 
	 	//Click Windows Option
	    driver.findElement(By.xpath("//a[text()='Windows']")).click();
	 
   
 //To move upward   
	//act.sendKeys(Keys.ARROW_UP).perform(); //Jul
	//act.sendKeys(Keys.ARROW_UP).perform();  //Jun
	//act.sendKeys(Keys.ARROW_UP).perform(); //May 
  
	//Wait
	 //Thread.sleep(2000);
	 
	 
	 //Select Option
	//act.sendKeys(Keys.ENTER).perform(); //May 

	
}
	

}



