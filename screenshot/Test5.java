package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	         //launch browser code
			WebDriver driver= new ChromeDriver();
			
			//enter url and open application	
			driver.get("https://www.flipkart.com/search?q=redmi+note+10s&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_3_9_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_3_9_na_na_na&as-pos=3&as-type=RECENT&suggestionId=redmi+note+10s&requestId=87494410-0e75-42a9-ba5b-618cc605d09d&as-searchtext=redmi%20note%2010s");
			
			//maximize Browser
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(2000);
			
			//Take screeshot of particular Element
			WebElement s1 =driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
			
			
			//wait
			Thread.sleep(1000);

			//typecast
			File src =s1.getScreenshotAs(OutputType.FILE);
			
			System.out.println(src);
			
			File dest=new File("C:\\Users\\Administrator\\Desktop\\screenshot\\.Sample3.jpg");
			
			FileHandler.copy(src,dest);
			
			
			


}
}