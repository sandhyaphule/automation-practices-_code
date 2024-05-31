package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class OrangeHRM_UtilityClass 
{
	    //Name: Viraj
		//Date: 15/03/2024
		//Day: Friday
		
		@Test                      
		public static String getDataFromExcelSheet(int RowIndex,int CellIndex) throws IOException 
		{
		//To reach upto ExcelSheet
		FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\revision\\.Revision_2024.xlsx");
		String s1=WorkbookFactory.create(file).getSheet("sheet10").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
	
		  return s1;  //java automation
		}
		        //Name: Viraj
				//Date: 15/03/2024
				//Day: Friday
		//To Capture Screenshot of Failed Test Cases
		
		@Test                                                           //TC101
		public static void CaptureScreenshot(WebDriver driver, String TestCaseID) throws IOException
		{
	        File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		                                                       //TC101
			File Destination=new File("C:\\Users\\Administrator\\Desktop\\screenshot\\.Sample2.jpg."+TestCaseID+".jpg");
			FileHandler.copy(Source,Destination);
		}
		
			@Test
			// code for properties 				//url //username
			public static String getdatafromPF(String key) throws IOException 
			{	
				//code for open configue.properties
				FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\revision\\.Revision_2024.xlsx");
				//create object of properties class
				Properties prop =new Properties(); 
				//To open properties file
				prop.load(file);
				//To Featch Data
				String value=prop.getProperty(key); //url 
				return value;//Admin
		}
		
	}



