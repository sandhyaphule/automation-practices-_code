package Parameterization_EXL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 
{
	   //row size
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//To reach upto Excelsheet    
			FileInputStream file =new FileInputStream("C:\\Users\\Administrator\\Desktop\\Revision_2024.xlsx");
		   Sheet s1 = WorkbookFactory.create(file).getSheet("sheet1");
		   
		   int LastRowsize = s1.getLastRowNum()+1;//3
		   
		   
		    
		    System.out.println(LastRowsize );	
		}

	}
