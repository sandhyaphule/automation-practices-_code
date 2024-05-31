package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test10 
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
		
		//click on  button
		driver.findElement(By.tagName("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		//not working xpath
		
	}
}
