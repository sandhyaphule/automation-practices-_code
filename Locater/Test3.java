package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser code
		//ChromeOptions option= new ChromeOptions();
		//option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		//WebDriver driver= new ChromeDriver();
		
		//Enter Url
		//driver.get("https://www.facebook.com/");
		
		//maximize Browser
		//driver.manage().window().maximize();
		
		//wait
		//Thread.sleep(2000);
		
		//click on the link create account button on click
         //xpath by contains by using attributes
		//tagname[contains(@attribute name ,@'attribute value')]

		//driver.findElement(By.xpath("")).click();
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement createAcc = driver.findElement(By.xpath("//*[contains(@class,'_42ft _4jy0 _6lti')]"));
		createAcc.click();
		 Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("sandhya");
	
	}

}
