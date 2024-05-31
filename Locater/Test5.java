package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser code
		ChromeOptions option= new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		//Enter Url
		driver.get("https://www.facebook.com/");
		
		//maximize Browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//click on create new account button
		driver.findElement(By.xpath("//*[contains(@class,'_42ft _4jy0 _6lti')]")).click();
		
		//wait
		Thread.sleep(2000);
		
		//enter user name 
		driver.findElement(By.xpath("//*[@id='u_a_b_1I']))]")).sendKeys("Gill");

		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Gill");
				
	}

}
