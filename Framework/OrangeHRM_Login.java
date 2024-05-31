package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login 
{ 
	 //POM Class-I	
	//1. Data members/Global Variables should be declared globally with access level private by using @Findby Annotation	

	 @FindBy(xpath="//*[@name='username']")	private WebElement UN;	
     @FindBy(id="password")	                    private WebElement PSW;	 
	 @FindBy(xpath="//input[@name='login']")    private WebElement Loginbtn;  
			
	 //2. Initialize within a constructor with access level public using PageFactory Class
	 
	 	 public OrangeHRM_Login(WebDriver driver)  //13 methods
	     {
	 		PageFactory.initElements(driver,this);
	     }
	 
	 //3. Utilize within a method with access level public
	 	
	 	public void enterUsername()  //Admin
	 	 {
	 		UN.sendKeys("Admin"); //Admin
	 	 }
	 	 
	 	 public void enterPassword()  //  
	 	 {
	 		PSW.sendKeys("Admin123"); //Admin123
	 	 }
	 	 
	 	 public void clickloginbutton() 
		 {
	 		Loginbtn.click();
		 }
	 

}













	 	 


	
