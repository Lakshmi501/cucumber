package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{
		//System.setProperty("webdriver.chrome.driver","C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C://Users//laksh//OneDrive//Documents//SoftwareTesting//Exelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("sheet1");
        Row r = sh.getRow(0);
        Cell c = r.getCell(0);
        String v = c.getStringCellValue();
        System.out.println(v);
        
	}
}
