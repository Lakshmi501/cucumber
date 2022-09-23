package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteData
{
	public static String writeData(String sheet, int row, int cell)
	{ 
		
		try
	     {
	       FileInputStream fis = new FileInputStream("C://Users//laksh//OneDrive//Documents//SoftwareTesting//Exelsheet.xlsx");
           Workbook wb = WorkbookFactory.create(fis);
           Cell c =  wb.getSheet(sheet).getRow(row).createCell(cell); 
           c.setCellValue(Exelsheet);
           FileOutputStream fout = new FileOutputStream("C://Users//laksh//OneDrive//Documents//SoftwareTesting//Exelsheet.xlsx");
	       wb.write(fout);
	     }
	    catch(Exception e)
	     {
		
	     }
	
	
    }

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "C://Users//laksh//Downloads//chromedriver_win32//chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com");
      String username = ReadUserIdPassword.getData("Sheet1", 1, 0);
      String password =  ReadUserIdPassword.getData("Sheet1", 1, 1);
      driver.findElement(By.xpath("(//input[@type ='text'])[2]")).sendKeys(username);
      driver.findElement(By.xpath("//input[@type ='password']")).sendKeys(password);
      driver.findElement(By.xpath("(//button[@type ='submit'])[2]")).click();
	}
	
	
}
