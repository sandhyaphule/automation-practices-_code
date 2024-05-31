package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 
{
	public static void main(String[] args) 
	{
		//open browser
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver= new ChromeDriver();
		
		//Enter Url
		driver.get("https://www.facebook.com/");//driver it as interface
		
		//maximxe Browser
		driver.manage().window().maximize();//windows it as interface
		//minimize Browser
		driver.manage().window().minimize();

}
}