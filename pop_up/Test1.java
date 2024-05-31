package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	//open browser
	ChromeOptions option = new ChromeOptions();
	WebDriver driver= new ChromeDriver();
	
	//To enter URL/Open an Application	
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 
	 
	       //maximize Browser
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(2000);
			
	 
	 Thread.sleep(2000);
	 
	 //Enter customerID
       driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("Pqrs12345");
	 
	 Thread.sleep(2000);
	 
	 //Click Submit Button
	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	 
	 Thread.sleep(2000);
	 
	//Switch to Alert pop-up	 
      Alert alt=driver.switchTo().alert();
	 
	 Thread.sleep(2000);
	 
	 //Click Ok button
	// alt.accept();
	 
	 //Click Cancel button
	 //alt.dismiss();

	 //To get parsent on Alret popup
	 
	//to get text present on alert pop-up 
     String S1=alt.getText();  //Do you really want to delete this Customer?
     System.out.println(S1);

	 
	}


}

