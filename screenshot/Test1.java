package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//launch browser code
		ChromeOptions option= new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		//Enter Url//open an application
		driver.get("https://kite.zerodha.com/");
		
		//maximize Browser
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
				
		//typecast /downcasting/convert
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		File dest=new File("C:\\Users\\Administrator\\Desktop\\screenshot\\.Sample1.jpg])");
		
		FileHandler.copy(src,dest);
		
		
		
		
	}
}
