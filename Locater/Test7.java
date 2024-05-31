package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser code
		ChromeOptions option= new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		//Enter Url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//maximize Browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.tagName("button")).click();//"tagname" 
	}
	

}
