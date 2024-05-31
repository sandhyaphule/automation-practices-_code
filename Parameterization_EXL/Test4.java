package Parameterization_EXL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//How to Read Numeric information as a String?

public class Test4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excelsheet    
		FileInputStream file =new FileInputStream("C:\\Users\\Administrator\\Desktop\\Revision_2024.xlsx");
	   String s1 = WorkbookFactory.create(file).getSheet("sheet4").getRow(0).getCell(0).getStringCellValue();
	    //"54321"
	    System.out.println(s1);	
	    
	}

}
//'lefthand side la shift jala data bydefult string consider karnar