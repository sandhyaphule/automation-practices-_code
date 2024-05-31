package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Test6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		   //open browser
			ChromeOptions option = new ChromeOptions();
			option.setBinary("C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64");
			WebDriver driver= new ChromeDriver();
			
			//Enter Url
			driver.get("https://www.facebook.com/");//driver it as interface
			
			//maximxe Browser
			driver.manage().window().maximize();//windows it as interface
			
			//wait
			Thread.sleep(2000);
			
            //click on button create new account
			//driver.findElement(By.xpath("//a[@text()='Create new account')]")).click();
			WebElement createAcc = driver.findElement(By.xpath("//*[contains(@class,'_42ft _4jy0 _6lti')]"));
			createAcc.click();

			//wait
			Thread.sleep(2000);
			
			//step1:identify listbox and store into the object
            WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			//step:2 create object on select class
			Select s1=new Select(month);
			
			
			//call the method 
			List<WebElement> s2 = s1.getAllSelectedOptions();//12 address
			
			for(WebElement s3:s2)
					{
						
						String s4= s3.getText();
						
						System.out.println(s4);					
						}
			
						
					}
					
					}
			
	