package Parameterization_EXL;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//How to fetch Numeric data from Excelsheet?
public class Test2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach upto Excelsheet  Numeric type value info saved   
		FileInputStream file =new FileInputStream("C:\\Users\\Administrator\\Desktop\\Revision_2024.xlsx");
	   double s2 =WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(0).getNumericCellValue();
	    
	    System.out.println(s2);	
	    
	}

}
