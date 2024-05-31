package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_DashBoard 
{	
	//POM Class-||
		//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation	

		 @FindBy(xpath="//*[@class=\"oxd-input oxd-input--active]")	private WebElement UserNameDashBoard;	
		//private WebElement UN=driver.findelement(By.xpath("//input[@id='username']"));

		 @FindBy(xpath="//*[@name='password']")	private WebElement PSW;	 
		  //private WebElement PSW=driver.findelement(By.id("password"));

		 @FindBy(xpath="//*[@class=\"oxd-userdropdown-link']") private WebElement Loginbtn;  
		//private WebElement Loginbtn=driver.findelement(By.xpath("//input[@name='login']"));
		
		 
		//2. Initialize within a constructor with access level public using PageFactory Class
		 
	 	 public OrangeHRM_DashBoard(WebDriver driver)  //13 methods
	     {
	 		PageFactory.initElements(driver,this);
	     }
	 	 
	 	 
	 	 //3. Utilize within a method with access level public
	 	 
	 	 public String gettextofUserName()
	 	 {
	 		 String actual=UserNameDashBoard.getText();//java Automation
	 		 return actual;////java Automation
	 	 }


		public void ClickUserName() 
		{
			
		}


		public void ClickLogoutButton() 
		{
			
		}


	 	 
	 	 

}
