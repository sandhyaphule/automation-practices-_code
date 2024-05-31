package Parameterization_EXL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//Row index
public class Test5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excelsheet    
		FileInputStream file =new FileInputStream("C:\\Users\\Administrator\\Desktop\\Revision_2024.xlsx");
	   Sheet s1 = WorkbookFactory.create(file).getSheet("sheet1");
	   
	   int LastRowindex = s1.getLastRowNum();//2
	   
	   
	    
	    System.out.println(LastRowindex );	
	}

}
