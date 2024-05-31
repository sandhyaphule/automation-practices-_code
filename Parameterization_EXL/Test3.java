package Parameterization_EXL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//How to fetch boolean data from Excelsheet?
public class Test3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excelsheet    
		FileInputStream file =new FileInputStream("C:\\Users\\Administrator\\Desktop\\Revision_2024.xlsx");
	   boolean s3 = WorkbookFactory.create(file).getSheet("sheet3").getRow(0).getCell(0).getBooleanCellValue();
	    
	    System.out.println(s3);	
	    
	    
	}
}
