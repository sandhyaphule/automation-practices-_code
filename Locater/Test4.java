package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser code
		ChromeOptions option= new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		//Enter Url
		driver.get("https://kite.zerodha.com/");
		
		//maximize Browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//click on the link
		driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID')]")).click();
		


	}


}
