
package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\laksh\\OneDrive\\Documents\\SoftwareTesting\\Exelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		    Sheet sh =   wb.getSheet("Sheet1");
	       int rc = sh.getLastRowNum();
	       for(int i = 0;i<=rc;i++)
	       {
	    	   Row r=  sh.getRow(i);
	    	   try
	    	   {
	    	       short c = r.getLastCellNum();
	               for(int j = 0;j<=c;j++)
	                  {
	    	               Cell cc = r.getCell(j);
	                       String s = cc.getStringCellValue();
	                       System.out.println(s);
	                   }
	    	   }
	          catch(Exception e)
	    	   {
	    	        System.out.println("");
	    	   }
	    	   
	}

}
}
